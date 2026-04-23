class Counter {
    int count = 0;

    synchronized void increment() {
        count++;   // now thread-safe
    }
}

public class NoRace {
    public static void main(String[] args) {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("Count: " + c.count);
    }
}