package DSACCodingInt.BitManipulation;

public class Intro {

    public static int repeatedArithmeticShift(int x, int count) {
        System.out.println(Integer.toBinaryString(x)+" "+x);
        for (int i = 0; i < count; i++) {
            x >>= 1;
            System.out.println(Integer.toBinaryString(x)+" "+x);
        }
        return x;
    }
    public static int repeatedLogicalShift(int x, int count) {
        System.out.println(Integer.toBinaryString(x)+" "+x);
        for (int i = 0; i < count; i++) {
            x >>>= 1;
            System.out.println(Integer.toBinaryString(x)+" "+x);
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(" "+repeatedArithmeticShift(93242,40));
        //System.out.println(" "+repeatedLogicalShift(93242,40));

    }
}
