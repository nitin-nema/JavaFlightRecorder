public class PerformanceTestApplication {
    public static void main(String[] args) {
        // Simulate heavy processing task
        for (int i = 0; i < 100; i++) {
            processTask();
        }
    }

    private static void processTask() {
        // Simulate CPU-bound work
        for (int j = 0; j < 1_000_000; j++) {
            Math.sqrt(j);
        }
    }
}
