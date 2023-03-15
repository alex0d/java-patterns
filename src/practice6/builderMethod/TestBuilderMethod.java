package practice6.builderMethod;

public class TestBuilderMethod {
    public static void main(String[] args) {
        Factory[] factories = {
                new FactoryA(),
                new FactoryB()
        };

        for (Factory factory : factories) {
            Product product = factory.factoryMethod();
            product.printInfo();
        }
    }
}
