public class problem03TypesAndFormatSpecifier {
    public static void main(String[] args) {
        
        /* Java primitive types and format specifiers */

        Byte a = 126; // 1 Byte = 8 bits

        System.out.printf("Byte Size - %d and Range - [%d, %d]\n", Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);

        short b = 3200; // 2 Byte = 16 bits

        System.out.printf("Short Size - %d and Range - [%d, %d]\n", Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);

        int c = 6400; // 4 Byte = 32 bits
        
        System.out.printf("Integer Size - %d and Range - [%d, %d]\n", Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);

        long d = 12800; // 8 Byte = 64 bits

        System.out.printf("Long Size - %d and Range - [%d, %d]\n", Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);

        float e = 2.79f; // 4 Byte = 32 bits

        double f = 123456789; // 8 Byte = 64 bits
        
        char g = 'A'; // 2 Byte = 16 bits
    
        boolean h = true; // Implementation dependent; conceptually 1 bit (True/False)

        System.out.printf("Primitive types and format specifiers\nBYTE - %d\nSHORT - %d\nINT - %d\nLONG - %d\nFLOAT - %f\nDOUBLE - %e\nCHAR - %c\nBOOLEAN - %b", a, b, c, d, e, f, g, h);
    }
}