package practice6.prototype;

public class TestPrototype {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype(100);

        ConcretePrototype copy = (ConcretePrototype) prototype.clone();

        System.out.println("Original value: " + prototype.getValue());
        System.out.println("Copy value: " + copy.getValue());
        System.out.println("Is it the same object: " + (prototype == copy));
    }
}