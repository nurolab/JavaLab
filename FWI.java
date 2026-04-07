import java.io.*;

public class FWI {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output.txt");

            fw.write("Learning Java File Handling");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}