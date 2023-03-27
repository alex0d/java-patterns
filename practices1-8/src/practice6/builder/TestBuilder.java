package practice6.builder;

public class TestBuilder {
    public static void main(String[] args) {
        Person person1 = new Person.PersonBuilder("Ivan", 40).build();
        System.out.println(person1);

        Person person2 = new Person.PersonBuilder("Petr", 20).setStudent(true).build();
        System.out.println(person2);

        Person person3 = new Person.PersonBuilder("Vasiliy", 21).setHasJob(true).setStudent(true).build();
        System.out.println(person3);
    }
}
