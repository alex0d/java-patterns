package practice5;

public class LazyInitSingleton {
    private static LazyInitSingleton instance;
    private String data;

    private LazyInitSingleton() {
        this.data = "This is LazyInitSingleton";
    }

    public static synchronized LazyInitSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitSingleton();
        }
        return instance;
    }

    public String getData() {
        return data;
    }
}
