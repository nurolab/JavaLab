// ---------- BASIC INTERFACE ----------
interface Animal {
    void makeSound();   // abstract method
}

// ---------- IMPLEMENTING INTERFACE ----------
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}


// ---------- MULTIPLE INTERFACES ----------
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck can fly");
    }

    public void swim() {
        System.out.println("Duck can swim");
    }
}


// ---------- DEFAULT METHODS ----------
interface Vehicle {

    void start();   // abstract method

    default void fuelType() {
        System.out.println("Default fuel type: Petrol");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }
}


// ---------- STATIC METHODS ----------
interface MathUtility {

    static int square(int x) {
        return x * x;
    }
}


// ---------- PRIVATE METHODS (Java 9+) ----------
interface Greeting {

    default void sayHello() {
        privateHelper();
        System.out.println("Hello from interface");
    }

    private void privateHelper() {
        System.out.println("Private helper method");
    }
}


// ---------- INTERFACE INHERITANCE ----------
interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class InterfaceChild implements ChildInterface {

    public void parentMethod() {
        System.out.println("Parent interface method");
    }

    public void childMethod() {
        System.out.println("Child interface method");
    }
}


// ---------- FUNCTIONAL INTERFACE ----------
@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}


// ---------- MAIN CLASS ----------
public class InterfaceDemo {

    public static void main(String[] args) {

        // Basic interface implementation
        Animal d = new Dog();
        d.makeSound();

        System.out.println("-------------------");

        // Multiple interfaces
        Duck duck = new Duck();
        duck.fly();
        duck.swim();

        System.out.println("-------------------");

        // Default method
        Car car = new Car();
        car.start();
        car.fuelType();

        System.out.println("-------------------");

        // Static method
        int result = MathUtility.square(5);
        System.out.println("Square = " + result);

        System.out.println("-------------------");

        // Private method via default method
        Greeting g = new Greeting() {};
        g.sayHello();

        System.out.println("-------------------");

        // Interface inheritance
        InterfaceChild obj = new InterfaceChild();
        obj.parentMethod();
        obj.childMethod();

        System.out.println("-------------------");

        // Lambda expression using functional interface
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.operate(5, 3));
        System.out.println("Multiplication: " + multiply.operate(5, 3));
    }
}