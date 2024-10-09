import java.lang.InterruptedException;

public class JFRThreadDemo extends Thread{
    public static void main(String args[]) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            allocateMemory();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Thread-1");

        Thread thread2 = new Thread(() -> {
            allocateMemory();
        }, "Thread-1");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }


    private static void allocateMemory() {
        byte[] array = new byte[1024];
        // Simulate some workload
        for (int i = 0; i < array.length; i++) {
            array[i] = (byte) (i % 128);
        }
    }
}