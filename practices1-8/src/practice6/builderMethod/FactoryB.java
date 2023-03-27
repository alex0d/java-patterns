package practice6.builderMethod;

public class FactoryB implements Factory {
    @Override
    public Product factoryMethod() {
        return new ProductB();
    }
}
