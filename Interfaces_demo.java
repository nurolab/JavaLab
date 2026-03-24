interface MyInterface {
    void myMethod(); // This is an abstract method, it has no body
}

public class Interfaces_demo implements MyInterface{
    public void myMethod() {
        System.out.println("Method implemented in Interfaces_demo");
    }

    public static void main(String[] args) {
        Interfaces_demo myObject = new Interfaces_demo();
        // Call the method defined in the interface
        myObject.myMethod();
    }
}
