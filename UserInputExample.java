import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine().trim();

            System.out.print("Enter your age in years: ");
            int age = readInt(scanner);

            System.out.print("Enter your favorite number: ");
            int favorite = readInt(scanner);

            int yearsToHundred = Math.max(0, 100 - age);
            System.out.println();
            System.out.println("Hi, " + name + "!");
            System.out.println("You will hit 100 in " + yearsToHundred + " year(s).");
            System.out.println("Your favorite number doubled is " + (favorite * 2) + ".");
        }
    }

    // Loop until the user enters a valid integer.
    private static int readInt(Scanner scanner) {
        while (true) {
            String line = scanner.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid whole number: ");
            }
        }
    }
}
