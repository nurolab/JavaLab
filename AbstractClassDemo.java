// Abstract class
abstract class Vehicle {

    // Variable in abstract class
    String brand;

    // Constructor in abstract class
    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called for: " + brand);
    }

    // Abstract method (must be implemented by subclass)
    abstract void startEngine();

    // Concrete method (normal method)
    void stopEngine() {
        System.out.println(brand + " engine stopped.");
    }

    // Final method (cannot be overridden)
    final void fuelType() {
        System.out.println("This vehicle uses fuel.");
    }

    // Static method
    static void vehicleInfo() {
        System.out.println("Vehicles are used for transportation.");
    }
}


// First subclass
class Car extends Vehicle {

    Car(String brand) {
        super(brand);   // calling abstract class constructor
    }

    // Implementing abstract method
    @Override
    void startEngine() {
        System.out.println(brand + " car engine started with key ignition.");
    }
}


// Second subclass
class Bike extends Vehicle {

    Bike(String brand) {
        super(brand);
    }

    // Implementing abstract method
    @Override
    void startEngine() {
        System.out.println(brand + " bike engine started with self start.");
    }
}


// Main class
public class AbstractClassDemo {

    public static void main(String[] args) {

        // Calling static method
        Vehicle.vehicleInfo();
        // Abstract class reference (runtime polymorphism)
        Vehicle v1 = new Car("Toyota");
        v1.startEngine();
        v1.stopEngine();
        v1.fuelType();

        System.out.println();

        Vehicle v2 = new Bike("Yamaha");
        v2.startEngine();
        v2.stopEngine();
        v2.fuelType();
    }
}