public class Stopwatch {
    private long start;

    public void start() {
        start = System.nanoTime();
    }

    public double stop() {
        long end = System.nanoTime();
        return (end - start) / 1_000_000.0; // ms
    }
}