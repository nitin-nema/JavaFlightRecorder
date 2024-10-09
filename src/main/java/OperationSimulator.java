import jdk.jfr.Event;

public class OperationSimulator {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            simulateOperation();
            Thread.sleep(1000);
        }
    }

    public static void simulateOperation() {
        OperationEvent event = new OperationEvent();
        long start = System.nanoTime();
        // Simulate operation
        for (int i = 0; i < 1_000_000; i++) {
            Math.sin(i);
        }
        event.duration = System.nanoTime() - start;
        event.commit();
    }

    static class OperationEvent extends Event {
        long duration;
    }
}
