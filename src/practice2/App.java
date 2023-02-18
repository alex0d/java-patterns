package practice2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public void start() {
        List<Human> people = new ArrayList<>();

        people.add(new Human(18, "Ivan", "Ivanov", LocalDate.of(2005, 5, 14), 70));
        people.add(new Human(35, "Nikolay", "Nikolaev", LocalDate.of(1988, 9, 25), 100));
        people.add(new Human(20, "Petr", "Petrov", LocalDate.of(2003, 6, 30), 68));
        people.add(new Human(25, "Sidor", "Sidorov", LocalDate.of(1998, 7, 15), 80));
        people.add(new Human(30, "Vasiliy", "Vasiliev", LocalDate.of(1993, 8, 20), 90));

        System.out.println("Список до изменений: ");
        people.forEach(System.out::println);

        System.out.println("\nУвеличение веса на 3:");
        people = people.stream()
                .peek(h -> h.setWeight(h.getWeight() + 3))
                .collect(Collectors.toList());
        people.forEach(System.out::println);

        System.out.println("\nСортировка по весу в обратном порядке:");
        people = people.stream()
                .sorted(Comparator.comparing(Human::getWeight).reversed())
                .collect(Collectors.toList());
        people.forEach(System.out::println);

        System.out.println("\nФильтрация по дате рождения, меньше, чем 01.01.2000:");
        people = people.stream()
                .filter(h -> h.getBirthDate().isBefore(LocalDate.of(2000, 1, 1)))
                .collect(Collectors.toList());
        people.forEach(System.out::println);

        int weightSum = people.stream()
                .map(Human::getWeight)
                .reduce(0, Integer::sum);
        System.out.println("\nСумма весов: " + weightSum);
    }
}
