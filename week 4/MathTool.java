class StopWatch {
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }
}

public class MathTool {
    public static long factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
        for (int i = 0; i < 1_000_000; i++) {
            factorialRecursive(20);
        }
        watch.stop();
        System.out.println("Recursive time: " + watch.getElapsedTime() + " ms");
        watch.start();
        for (int i = 0; i < 1_000_000; i++) {
            factorialIterative(20);
        }
        watch.stop();
        System.out.println("Iterative time: " + watch.getElapsedTime() + " ms");
    }
}