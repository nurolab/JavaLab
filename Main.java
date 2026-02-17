class Device {
    String brand;
    Device(){
            System.out.println("Step 1: Device default constructor called.");
    }
    // Parent constructor
    Device(String brand) {
        this.brand = brand;
        System.out.println("Step 1: Device brand initialized to " + brand);
    }
}

class Smartphone extends Device {
    String model;
    int storage;

    // 1. Default constructor
    // Chains to the specialized constructor using this()
    public Smartphone() {
        this("Generic Model", 128);
        super.brand = "Samsung";
         // Setting brand after calling the specialized constructor
        System.out.println("Step 4: Default constructor completed.");
    }

    // 2. Specialized constructor
    // Chains to the parent constructor using super()
    public Smartphone(String model, int storage) {
        super("TechCorp"); // Calling Device(brand)
        this.model = model;
        this.storage = storage;
        System.out.println("Step 2: Smartphone model and storage initialized.");
    }

    void displayInfo() {
        System.out.println("Step 3: Device: " + brand + " | Model: " + model + " | Storage: " + storage + "GB");
    }
}

public class Main {
    public static void main(String[] args) {
        // Triggering the chain
        Smartphone myPhone = new Smartphone();
        myPhone.displayInfo();
    }
}