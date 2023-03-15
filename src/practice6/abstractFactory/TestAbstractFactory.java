package practice6.abstractFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory[] factories = {
                new Factory1(),
                new Factory2()
        };

        for (AbstractFactory factory : factories) {
            AbstractProductA productA = factory.createProductA();
            productA.printInfoA();

            AbstractProductB productB = factory.createProductB();
            productB.printInfoB();
        }
    }
}
