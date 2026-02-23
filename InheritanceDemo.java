// Program to demonstrate all types of Inheritance in Java

// ============================================
// 1. SINGLE INHERITANCE
// ============================================
// Base class for Single Inheritance
class Animal {
    String name;
    
    void eat() {
        System.out.println("Animal is eating");
    }
    
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Derived class - Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// ============================================
// 2. MULTILEVEL INHERITANCE
// ============================================
// First level
class Vehicle {
    String brand;
    
    void startEngine() {
        System.out.println("Vehicle engine started");
    }
}

// Second level - inherits from Vehicle
class Car extends Vehicle {
    int numberOfDoors;
    
    void drive() {
        System.out.println("Car is driving");
    }
}

// Third level - inherits from Car (Multilevel)
class SportsCar extends Car {
    int topSpeed;
    
    void turboBoost() {
        System.out.println("Sports car turbo boost activated!");
    }
}

// ============================================
// 3. HIERARCHICAL INHERITANCE
// ============================================
// Parent class
class Shape {
    String color;
    
    void display() {
        System.out.println("This is a shape");
    }
}

// Multiple classes inherit from Shape (Hierarchical)
class Circle extends Shape {
    double radius;
    
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;
    
    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base;
    double height;
    
    double calculateArea() {
        return 0.5 * base * height;
    }
}

// ============================================
// 4. MULTIPLE INHERITANCE (Through Interfaces)
// ============================================
// First interface
interface Flyable {
    void fly();
}

// Second interface
interface Swimmable {
    void swim();
}

// Class implementing multiple interfaces
class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
    
    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
    
    void quack() {
        System.out.println("Duck is quacking");
    }
}

// ============================================
// 5. HYBRID INHERITANCE (Combination of above)
// ============================================
// Interface for hybrid inheritance
interface Chargeable {
    void charge();
}

// Base class
class ElectronicDevice {
    String manufacturer;
    
    void powerOn() {
        System.out.println("Device powered on");
    }
}

// Derived class implementing interface
class Smartphone extends ElectronicDevice implements Chargeable {
    String model;
    
    void makeCall() {
        System.out.println("Making a phone call");
    }
    
    @Override
    public void charge() {
        System.out.println("Smartphone is charging");
    }
}

// Another derived class from ElectronicDevice
class Laptop extends ElectronicDevice implements Chargeable {
    int ramSize;
    
    void runProgram() {
        System.out.println("Running program on laptop");
    }
    
    @Override
    public void charge() {
        System.out.println("Laptop is charging");
    }
}

// ============================================
// MAIN CLASS
// ============================================
public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== INHERITANCE DEMONSTRATION IN JAVA ===\n");
        
        // 1. SINGLE INHERITANCE DEMO
        System.out.println("1. SINGLE INHERITANCE:");
        System.out.println("----------------------");
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.eat();      // Inherited method
        dog.sleep();    // Inherited method
        dog.bark();     // Own method
        System.out.println();
        
        // 2. MULTILEVEL INHERITANCE DEMO
        System.out.println("2. MULTILEVEL INHERITANCE:");
        System.out.println("--------------------------");
        SportsCar ferrari = new SportsCar();
        ferrari.brand = "Ferrari";
        ferrari.numberOfDoors = 2;
        ferrari.topSpeed = 350;
        ferrari.startEngine();  // From Vehicle (1st level)
        ferrari.drive();        // From Car (2nd level)
        ferrari.turboBoost();   // From SportsCar (3rd level)
        System.out.println("Brand: " + ferrari.brand + ", Top Speed: " + ferrari.topSpeed + " km/h");
        System.out.println();
        
        // 3. HIERARCHICAL INHERITANCE DEMO
        System.out.println("3. HIERARCHICAL INHERITANCE:");
        System.out.println("----------------------------");
        Circle circle = new Circle();
        circle.color = "Red";
        circle.radius = 5.0;
        System.out.println("Circle - Color: " + circle.color + ", Area: " + circle.calculateArea());
        
        Rectangle rectangle = new Rectangle();
        rectangle.color = "Blue";
        rectangle.length = 10.0;
        rectangle.width = 5.0;
        System.out.println("Rectangle - Color: " + rectangle.color + ", Area: " + rectangle.calculateArea());
        
        Triangle triangle = new Triangle();
        triangle.color = "Green";
        triangle.base = 8.0;
        triangle.height = 6.0;
        System.out.println("Triangle - Color: " + triangle.color + ", Area: " + triangle.calculateArea());
        System.out.println();
        
        // 4. MULTIPLE INHERITANCE (Through Interfaces) DEMO
        System.out.println("4. MULTIPLE INHERITANCE (Through Interfaces):");
        System.out.println("----------------------------------------------");
        Duck duck = new Duck();
        duck.fly();     // From Flyable interface
        duck.swim();    // From Swimmable interface
        duck.quack();   // Own method
        System.out.println();
        
        // 5. HYBRID INHERITANCE DEMO
        System.out.println("5. HYBRID INHERITANCE:");
        System.out.println("----------------------");
        Smartphone phone = new Smartphone();
        phone.manufacturer = "Samsung";
        phone.model = "Galaxy S24";
        phone.powerOn();    // From ElectronicDevice
        phone.makeCall();   // Own method
        phone.charge();     // From Chargeable interface
        System.out.println("Manufacturer: " + phone.manufacturer + ", Model: " + phone.model);
        
        System.out.println();
        
        Laptop laptop = new Laptop();
        laptop.manufacturer = "Dell";
        laptop.ramSize = 16;
        laptop.powerOn();       // From ElectronicDevice
        laptop.runProgram();    // Own method
        laptop.charge();        // From Chargeable interface
        System.out.println("Manufacturer: " + laptop.manufacturer + ", RAM: " + laptop.ramSize + "GB");
        
        System.out.println("\n=== ALL INHERITANCE TYPES DEMONSTRATED ===");
    }
}
