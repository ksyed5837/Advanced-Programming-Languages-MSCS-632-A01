public class JavaMemoryDemo {
    public static void main(String[] args) {
        int[] data = new int[10000000];
        System.out.println("Memory allocated");

        data = null;
        System.gc();
        System.out.println("Garbage collection requested");
    }
}
