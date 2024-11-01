package concept.BitMinipulation;

public class NumberOfBitsFlip {

    // Number of bits to flip to change the number
    // use XOR operatore to get bits need to flip
    // count count it and return


    public static int bitsToflip(int given,int res){
        int xorNumber = given^res;
       return CountNumberOfsetBits.countSetBitInbitsO(xorNumber);
// time complexity log2(start^res)
    }
    public static void main(String args[]){

        System.out.println(bitsToflip(10,7));
        System.out.println(bitsToflip(4,3));

    }
}
