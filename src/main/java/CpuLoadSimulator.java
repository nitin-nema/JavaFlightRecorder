public class CpuLoadSimulator {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 4; i++) {
            new Thread(CpuLoadSimulator::simulateLoad).start();
        }
    }

    private static void simulateLoad() {
        long end = System.currentTimeMillis() + 60 * 1000; // 60 seconds load
        while (System.currentTimeMillis() < end) {
            double result = Math.sin(Math.random()); // Simulate CPU work
        }
    }
}
