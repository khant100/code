package JavaSeven;

public class BinarylitrelJAVASEven {
    // number can represented in binary literal form
    public static void main(String[] args) {
        // Binary literal in byte type
        byte b1 = 0b101;    // Using b0, The b can be lower or upper case
        byte b2 = 0B101;    // Using B0
        System.out.println("----------Binary Literal in Byte----------------");
        System.out.println("b1 = "+b1);
        System.out.println("b2 = "+b2);

        // Binary literal in short type
        short s1 = 0b101;   // Using b0, The b can be lower or upper case
        short s2 = 0B101;   // Using B0
        System.out.println("----------Binary Literal in Short----------------");
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);

        // Binary literal in int type
        int i1 = 0b101;     // Using b0, The b can be lower or upper case
        int i2 = 0B101;     // Using B0
        System.out.println("----------Binary Literal in Integer----------------");
        System.out.println("i1 = "+i1);
        System.out.println("i2 = "+i2);

        // Binary literal in long type
        long l1 = 0b0000011111100001;   // Using b0, The b can be lower or upper case
        long l2 = 0B0000011111100001;   // Using B0
        System.out.println("----------Binary Literal in Long----------------");
        System.out.println("l1 = "+l1);
        System.out.println("l2 = "+l2);


        // Basically use of _ in numeric literal
        int a = 10_00000;
        System.out.println("a = "+a);
        // Underscore in floating literal
        float b = 10.5_000f;
        System.out.println("b = "+b);
        // Underscore in binary literal
        int c = 0B10_10;
        System.out.println("c = "+c);
        // Underscore in hexadecimal literal
        int d = 0x1_1;
        System.out.println("d = "+d);
        // Underscore in octal literal
        int e = 01_1;
        System.out.println("e = "+e);
    }
}
