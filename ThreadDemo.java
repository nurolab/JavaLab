class MyThread extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
        }
    }
    public void walk() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread is walking: " + i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // start thread
        MyThread t2 = new MyThread();
        t2.start();  // call walk method
    }
}