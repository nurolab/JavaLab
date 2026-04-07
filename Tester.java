import com.util.io.Calculator;
public class Tester{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        System.out.println("The sum is: " + result);
    }
}