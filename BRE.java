import java.io.*;

public class BRE {
    public static void main(String[] args) {

        String fileName = "test.txt";

        // 🔹 Using FileReader (character by character)
        try {
            FileReader fr = new FileReader(fileName);
            int ch;

            System.out.println("Reading using FileReader:");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\n------------------------\n");

        // 🔹 Using BufferedReader (line by line)
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            System.out.println("Reading using BufferedReader:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}