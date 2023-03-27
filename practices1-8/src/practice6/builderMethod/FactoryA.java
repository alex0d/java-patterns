package practice6.builderMethod;

public class FactoryA implements Factory {
    @Override
    public Product factoryMethod() {
        return new ProductA();
    }
}
