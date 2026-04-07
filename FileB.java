import java.io.*;

public class FileB {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("test.txt");

            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}