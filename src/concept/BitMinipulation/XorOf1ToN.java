package concept.BitMinipulation;

public class XorOf1ToN {

    // count xor frm 1 to given number
    public static int xor(int n){
        if(n%4==1){
            return 1;
        }else if(n%4==2){
            return n+1;
        }
        else if(n%4==3){
            return 0;
        }else{
            return n;
        }
    }
    public static int xorb(int st,int end){
       int xor =st;
        for(int i=st+1;i<=end;i++){
            xor^=i;
        }
    return xor;
    }
    // brutforce is to loop from given number to last number
    public static void main(String args[]){
        // finding number of xor till N
        // there is pattern  N 1 = 1 this pattern repets
        //N 2 = 3 N 5 = 1
        // N 3 = 0 N 6 = 7
       // N 4 = 4  N 7 = 0 N 8 = 8
        // suppose finding xor from 4 to 10
        // we can find xor from 1 to 10 and xor from 1 to 5  while doing xor of both
        // result we can get xor from 5 tp 10 as xor from 1to 5 from both side will cancle each other

        System.out.println(xor(8));
        System.out.println(xorb(1,10)^xorb(1,5));
        System.out.println(xor(5));
        System.out.println(xor(10));
        System.out.println(xorb(1,8));
        System.out.println(xorb(6,10));
        System.out.println(xorb(1,5));
        System.out.println(xorb(1,10));


    }
}
