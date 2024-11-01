package concept.BitMinipulation;

public class CountNumberOfsetBits {

    public static int countSetBit(int n){
        int count =0;
        while(n>0){
            if(n%2==1){
                count++;
            }

            n=n/2;
        }
        return count;
    }

    public static int countSetBitInbitsO(int n){
        int count =0;
        while(n>0){
                count+=n&1;
            n=n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        int n=13;
        int n1 =10;
        System.out.println(countSetBit(n));
        System.out.println(countSetBit(n1));
        System.out.println(countSetBitInbitsO(n));
        System.out.println(countSetBitInbitsO(n1));

    }
}
