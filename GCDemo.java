public class GCDemo {

    String objectName;

    // Constructor
    public GCDemo(String name) {
        this.objectName = name;
        System.out.println("Created: " + this.objectName);
    }

    // Overriding finalize method 
    // (Note: This is deprecated since Java 9)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing: " + this.objectName + " | Thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        // 1. Create objects
        GCDemo obj1 = new GCDemo("Object_1");
        GCDemo obj2 = new GCDemo("Object_2");

        // 2. Make objects eligible for Garbage Collection
        // By setting them to null, they have no live references
        obj1 = null;
        obj2 = null;

        // 3. Suggesting the JVM to run Garbage Collector
        System.out.println("Requesting JVM to perform Garbage Collection...");
        System.gc(); 

        // 4. Giving the GC a small moment to run before the program ends
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Main method execution finished.");
    }
}