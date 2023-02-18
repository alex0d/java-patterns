package practice1;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 4, 5, 6, 9, 10, 12, 15, 0, 1));

        Consumer<List<Integer>> consumer = (lst) -> System.out.println(lst.stream().sorted().toList());
        consumer.accept(numbers);
    }
}
