package practice3;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
//        final Set<Integer> set = new HashSet<>();
        final Set<Integer> set = new SemaphoreSynchronizedSet<>();

        final int maxValue = 1_000_000;
        set.add(maxValue);

        new Thread(() -> {
            for (int v = 0; v < maxValue; v++) {
                set.add(v);
            }
        }).start();


        while (true) {
            if (!set.contains(maxValue)) {
                throw new RuntimeException("This set is not thread safe.");
            }
        }
    }
}
