public class Benchmarking {
    public static void main(String[] args) {
        Stopwatch sw = new Stopwatch();

        sw.start();

        // Code to benchmark
        for (int i = 0; i < 1_000_000; i++) {
            Math.sqrt(i);
        }

        double time = sw.stop();

        System.out.println("Execution Time: " + time + " ms");
    }
}