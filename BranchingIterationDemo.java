public class BranchingIterationDemo {
    public static void main(String[] args) {
        int number = 7;
        String role = "admin";

        // if / else if / else: choose one branch based on boolean conditions
        if (number < 0) {
            System.out.println("number is negative");
        } else if (number == 0) {
            System.out.println("number is zero");
        } else {
            System.out.println("number is positive");
        }

        // switch: select a branch based on a single expression's value
        switch (role) {
            case "admin":
                System.out.println("Welcome, admin");
                break; // prevents falling through to the next case
            case "editor":
                System.out.println("Welcome, editor");
                break;
            case "viewer":
                System.out.println("Welcome, viewer");
                break;
            default:
                System.out.println("Role not recognized");
        }

        // for loop: run a known number of iterations
        for (int i = 0; i < 3; i++) {
            System.out.println("for loop i=" + i);
        }

        // while loop: run until the condition becomes false
        int count = 2;
        while (count > 0) {
            System.out.println("while loop count=" + count);
            count--; // ensure the loop eventually ends
        }

        String a[] = {"1", "2", "c", "d", "5"};
        for (String i : a) {
            System.out.println("Enhanced for loop value=" + i);
        }   
    }
}
