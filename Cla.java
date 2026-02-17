
import java.util.Scanner;

public class Cla{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            int a = 4;
            Integer io = Integer.valueOf(sc.nextLine());
            System.out.println(a+io);
        }}}