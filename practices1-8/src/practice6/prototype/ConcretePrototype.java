package practice6.prototype;

public class ConcretePrototype implements Prototype {
    private int value;

    public ConcretePrototype(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(value);
    }
}