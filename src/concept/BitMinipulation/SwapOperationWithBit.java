package concept.BitMinipulation;

public class SwapOperationWithBit {

    // swap 2 number using XOR of bitMinuplation
    public static void swap(int a, int b){
        System.out.println("a= "+a+"b= "+b);
        a = a^b;
        // a = a^b
        b=a^b;
        // b = a^b^b
        //b^b = 0 so b = a
        a=a^b;
        System.out.println("After swap");
        System.out.println("a= "+a+"b= "+b);

    }

    public static boolean checkIthBitLeft(int n,int i){
        // if we want to check bit at ith position
        // take 1 int and do a left shift to ith position
        // now use "&" operator if result is non-zero its set else not set
       return  (n&(1<<i))!=0;



    }
    public static boolean checkIthBitRight(int n,int i){
        // if we want to check bit at ith position
        // take n int and do a right shift to ith position
        // now use "&" operator if result is non-zero its set else not set
        return  ((n>>i)&1)!=0;



    }

    public static int setIthBitRight(int n,int i){
        // take 1 and do a left shift to ith position
        //In order to set ith bit of n integer we need
        // to use or operation and return value
        return (n|(1<<i));
    }

    public static int clearIthBitRight(int n,int i){
        // take 1 and do a left shift to ith position
        // use not operator ~ to set ith bit to 0
        //In order to clear ith bit of n integer we need
        // to use & operation and return value
        return (n&~(1<<i));
    }

    public static int toggleIthBitRight(int n,int i){
        // take 1 and do a left shift to ith position
        // use XOR operator  to toggal ith bit to 0
        //In order to toggle ith bit of n integer we need
        // to use ^ operation and return value
        return (n^(1<<i));
    }

    public static int RemovelastsetDigit(int n){
        // take n and n-1  number
        // use AND operation
        //use n&n-1 to remove last set bit

        return (n&(n-1));
    }

    public static boolean checkIfPowerOf2(int n){
        // take n and n-1  number
        // use AND operation
        //use n&n-1 to remove last set bit

        return (n&(n-1))==0;
    }
    public static void main(String args[]){


        int a =5;
        int b = 55;

       swap(a,b);
      System.out.println( checkIthBitLeft(13,2));
        System.out.println( checkIthBitLeft(13,1));

        System.out.println( checkIthBitRight(13,2));
        System.out.println( checkIthBitRight(13,1));
        System.out.println( "Ith bit set to "+1+" which is "+setIthBitRight(13,1));
        System.out.println( "Ith bit set to "+1+" which is "+setIthBitRight(13,2));
        System.out.println( "Ith bit clear to "+0+" which is "+clearIthBitRight(13,2));
        System.out.println( "Ith bit clear to "+0+" which is "+clearIthBitRight(13,1));
        System.out.println( "Ith bit toggle to if 1 its 0 , if 0 it converts to 1 which is "+toggleIthBitRight(13,2));
        System.out.println( "Ith bit toggle to if 1 its 0 , if 0 it converts to 1 which is "+toggleIthBitRight(13,1));
        System.out.println("check if power of 2"+checkIfPowerOf2(64));
        System.out.println("check if power of 2"+checkIfPowerOf2(20));
        System.out.println("Remove last set digit"+RemovelastsetDigit(13));
        System.out.println("check if power of 2"+RemovelastsetDigit(20));
        int num=70 ;
        int i=3;
        System.out.println(""+(num&(1<<i))+" "+(num|(1<<i))+" "+(num&(~(1<<i))));
    }
}
