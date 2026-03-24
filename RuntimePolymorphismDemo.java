class Animal {
    void makeSound(){
        System.out.println("Animal making a sound...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        // 1. Upcasting: Child object to Parent reference
        Animal animal1 = new Dog(); 
        Animal animal2 = new Cat();
        animal1.makeSound();
        Cat myCat = (Cat) animal1; // Downcasting
        myCat.makeSound(); // Valid

        animal1.makeSound(); // Output: Dog barks: Woof Woof!
        animal2.makeSound(); // Output: Cat meows: Meow Meow!
    }
}