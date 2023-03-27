package practice3;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
//        final Map<Integer, String> map = new HashMap<>();
        final Map<Integer, String> map = new LockSynchronizedMap<>();

        final int targetKey = 100_000;
        final String targetValue = "v";
        map.put(targetKey, targetValue);

        new Thread(() -> {
            for (int key = 0; key < targetKey; key++) {
                map.put(key, "someValue");
            }
        }).start();


        while (true) {
            if (!targetValue.equals(map.get(targetKey))) {
                throw new RuntimeException("This map is not thread safe.");
            }
        }
    }
}
