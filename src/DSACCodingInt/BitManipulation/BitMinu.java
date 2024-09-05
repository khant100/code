package DSACCodingInt.BitManipulation;

public class BitMinu {


    static int updatebits(int n, int m , int i, int j){
        int allones =~0;
        int left = allones << (j+1);
        int right =((1<<i)-1);
        int mask = left|right;

        int n_cleared = n & mask;
        int m_shifted = m<<i;

        return n_cleared | m_shifted;

    }
    public static void main(String[] args) {
        //System.out.println(" "+updatebits(10000000000,10011,2,6));
    }
}
