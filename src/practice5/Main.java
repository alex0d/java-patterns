package practice5;

public class Main {
    public static void main(String[] args) {
        LazyInitSingleton lazyInitSingleton = LazyInitSingleton.getInstance();
        System.out.println(lazyInitSingleton.getData());

        EnumSingleton enumSingleton = EnumSingleton.getInstance();
        System.out.println(enumSingleton.getData());

        HoldSingleton holdSingleton = HoldSingleton.getInstance();
        System.out.println(holdSingleton.getData());
    }
}
