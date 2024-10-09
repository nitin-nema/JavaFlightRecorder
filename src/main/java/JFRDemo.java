public class JFRDemo {

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            allocateMemory();
        }
    }

    private static void allocateMemory() {
        byte[] array = new byte[1024];
        // Simulate some workload
        for (int i = 0; i < array.length; i++) {
            array[i] = (byte) (i % 128);
        }
    }
}
