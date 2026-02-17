
class Test{
    public static void main(String[] args) {
        System.out.println("=== JAVA PRIMITIVE DATA TYPES AND THEIR RANGES ===\n");
        
        // 1. byte - 8-bit signed integer
        byte byteVar = 127;
        System.out.println("1. byte:");
        System.out.println("   Size: 8 bits (1 byte)");
        System.out.println("   Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("   Example: " + byteVar + "\n");
        
        // 2. short - 16-bit signed integer
        short shortVar = 32000;
        System.out.println("2. short:");
        System.out.println("   Size: 16 bits (2 bytes)");
        System.out.println("   Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("   Example: " + shortVar + "\n");
        
        // 3. int - 32-bit signed integer
        int intVar = 2147483647;
        System.out.println("3. int:");
        System.out.println("   Size: 32 bits (4 bytes)");
        System.out.println("   Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("   Example: " + intVar + "\n");
        
        // 4. long - 64-bit signed integer
        long longVar = 9223372036854775807L;
        System.out.println("4. long:");
        System.out.println("   Size: 64 bits (8 bytes)");
        System.out.println("   Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("   Example: " + longVar + "\n");
        
        // 5. float - 32-bit floating point
        float floatVar = 3.14159f;
        System.out.println("5. float:");
        System.out.println("   Size: 32 bits (4 bytes)");
        System.out.println("   Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("   Example: " + floatVar + "\n");
        
        // 6. double - 64-bit floating point
        double doubleVar = 3.141592653589793;
        System.out.println("6. double:");
        System.out.println("   Size: 64 bits (8 bytes)");
        System.out.println("   Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("   Example: " + doubleVar + "\n");
        
        // 7. char - 16-bit Unicode character
        char charVar = 'A';
        System.out.println("7. char:");
        System.out.println("   Size: 16 bits (2 bytes)");
        System.out.println("   Range: " + (int)Character.MIN_VALUE + " to " + (int)Character.MAX_VALUE);
        System.out.println("   Unicode Range: '\\u0000' to '\\uFFFF'");
        System.out.println("   Example: " + charVar + "\n");
        
        // 8. boolean - true or false
        boolean booleanVar = true;
        System.out.println("8. boolean:");
        System.out.println("   Size: Not precisely defined (depends on JVM)");
        System.out.println("   Values: true or false");
        System.out.println("   Example: " + booleanVar + "\n");
        
        System.out.println("=== END OF PRIMITIVE DATA TYPES ===");
    }
}
