public class NewDay{
    public static void main(String[] args) {
        byte byteVar = 127;
        /*
            B - 1 byte
            S - 2 bytes
            I - 4 bytes
            L - 8 bytes
            F - 4 bytes
            D - 8 bytes
            C - 2 bytes
        */
        byte b = 2;
        short s = 3;
        int i = 4;
        long l = 5L;
        float f = 3.14f;
        double d = 3.141592653589793;
        double d2 = i;

        i = (int) d;
        System.out.println("Byte variable: " + byteVar);
        System.out.print("Hi");
    }
}