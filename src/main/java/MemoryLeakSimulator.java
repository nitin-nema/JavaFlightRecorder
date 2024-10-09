import java.util.HashMap;
import java.util.Map;

public class MemoryLeakSimulator {
    private static final Map<Integer, String> cache = new HashMap<>();

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        while (true) {
            cache.put(i++, "Memory Leak Example: " + i);
            Thread.sleep(100); // Simulate some processing
        }
    }
}
