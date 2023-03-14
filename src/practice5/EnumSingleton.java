package practice5;

public enum EnumSingleton {
    INSTANCE;

    private String data;

    EnumSingleton() {
        data = "This is EnumSingleton";
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public String getData() {
        return data;
    }
}
