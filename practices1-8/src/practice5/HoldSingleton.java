package practice5;

public class HoldSingleton {
    private String data;

    private HoldSingleton() {
        data = "This is HoldSingleton";
    }

    private static class HoldSingletonHolder {
        private static final HoldSingleton INSTANCE = new HoldSingleton();
    }

    public static HoldSingleton getInstance() {
        return HoldSingletonHolder.INSTANCE;
    }

    public String getData() {
        return data;
    }
}
