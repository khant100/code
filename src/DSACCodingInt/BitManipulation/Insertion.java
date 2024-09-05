package DSACCodingInt.BitManipulation;

public class Insertion {

    static int updaterBit(int n , int m , int i, int j){
        int allO = ~0;
        System.out.println(Integer.toBinaryString(allO)+" : Int : "+allO);
        int left = allO<<(j+1);
        System.out.println(Integer.toBinaryString(left)+" :left Int : "+left);
        int right =(1<<i)-1;
        System.out.println(Integer.toBinaryString(right)+" : right Int : "+right);
        int mask = left | right;
        System.out.println(Integer.toBinaryString(mask)+" : mask Int : "+mask);
        n = n & mask;
        System.out.println(Integer.toBinaryString(n)+" : n : "+n);
        m = m<<i;
        System.out.println(Integer.toBinaryString(m)+" : m : "+m);

        System.out.println(Integer.toBinaryString(m|n)+" : m | n Int : "+(m|n));
        return m|n;
    }
    public static void main(String[] args) {

        System.out.println(" "+updaterBit(Integer.parseInt("10000000000",2),Integer.parseInt("10011",2),2,6));
    }
}
