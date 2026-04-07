import java.io.*;

public class FileBO {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");

            String data = "Hello Students!";
            fos.write(data.getBytes());

            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}