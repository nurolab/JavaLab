// Demo of Java 'super' keyword
// super is used to call parent class methods, constructors, and variables

// Parent class
class Animal {
    String name;
    int age;
    
    // Parent constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal constructor called: " + name);
    }
    
    // Parent method
    void displayInfo() {
        System.out.println("Animal Name: " + name + ", Age: " + age);
    }
    
    void eat() {
        System.out.println(name + " is eating...");
    }
}

// Child class
class Dog extends Animal {
    String breed;
    
    // Child constructor
    Dog(String name, int age, String breed) {
        // super() calls the parent constructor
        super(name, age);
        this.breed = breed;
        System.out.println("Dog constructor called: " + breed);
    }
    
    // Overriding parent method
    @Override
    void displayInfo() {
        // super.displayInfo() calls parent's displayInfo method
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
    
    @Override
    void eat() {
        System.out.println(name + " is eating dog food...");
    }
    
    // Additional method showing parent method call
    void performSuperCall() {
        System.out.println("\n--- Demonstrating super keyword ---");
        
        // Calling parent's eat() method
        System.out.println("Calling super.eat():");
        super.eat();
        
        // Calling child's eat() method
        System.out.println("Calling child's eat():");
        eat();
        
        // Accessing parent variable through super
        System.out.println("Parent variable access - super.name: " + super.name);
    }
}

// Another example: Cat class
class Cat extends Animal {
    String color;
    
    Cat(String name, int age, String color) {
        super(name, age);  // Call parent constructor
        this.color = color;
        System.out.println("Cat constructor called: " + color);
    }
    
    @Override
    void displayInfo() {
        super.displayInfo();  // Call parent method
        System.out.println("Color: " + color);
    }
    
    @Override
    void eat() {
        System.out.println(name + " is eating cat food...");
    }
}

// Main class to demonstrate
public class SuperKeywordDemo {
    public static void main(String[] args) {
        System.out.println("===== Super Keyword Demo =====\n");
        
        // Dog example
        System.out.println("--- Creating Dog object ---");
        Dog dog = new Dog("Buddy", 5, "Golden Retriever");
        
        System.out.println("\n--- Calling displayInfo() ---");
        dog.displayInfo();
        
        dog.performSuperCall();
        
        // Cat example
        System.out.println("\n\n--- Creating Cat object ---");
        Cat cat = new Cat("Whiskers", 3, "Orange");
        
        System.out.println("\n--- Calling displayInfo() ---");
        cat.displayInfo();
        
        System.out.println("\n--- Calling eat() ---");
        cat.eat();
        
        System.out.println("\n===== Key Points =====");
        System.out.println("1. super() - calls parent constructor");
        System.out.println("2. super.methodName() - calls parent method");
        System.out.println("3. super.variableName - accesses parent variable");
        System.out.println("4. When overriding, use super to access parent implementation");
    }
}
