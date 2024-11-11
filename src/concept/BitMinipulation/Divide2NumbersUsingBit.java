package concept.BitMinipulation;

public class Divide2NumbersUsingBit {
 // didvide 2 integer from Integer.MIN_VALUE to Integer.MAX_VALUE
    // answer will be negetive only if
    // devident is negative or both are positive so have a sign boolen
    // and use Math.abs() for getitng absolute value of both
    // suppose we have 22 and 3 so we need to convert problem in 2 to power
    // 3* 2pow 0 = 3 3* 2pow 1 = 6 3* 2 pow 2 12 and 3* 2 3 = 24 > then dividend so we can go till
    //3 * 2pow 2 max after substracting number 22-12 = 10 , 10-6 = 4 4 -3 = 1 < divisor
    // aswer = 2 pow 2 + 2 pow 1 + 2 pow 0 = 4+2+1 = 7

    public static int divide(int dividend, int divisor){

        if(dividend==divisor){
            return 1;
        }
        boolean sign=true;
        if((dividend<0&&divisor>0)||(dividend>0&&divisor<0)){
            sign=false;
        }
        long div = Math.abs((long) dividend);
        long dir = Math.abs((long) divisor);
        long result = 0;

        while(div>=dir){
            int count=0;
            while(div>=(dir<<(count+1))){
                count++;
            }
            result+=1<<count;
            div-=dir<<count;
        }
        if(result>Integer.MAX_VALUE&&sign){
            return Integer.MAX_VALUE;
        }
        if(result>Integer.MAX_VALUE&&!sign){
            return Integer.MIN_VALUE;
        }
return sign ? (int) result :(int) -result;

    }



    public static void main(String args[]){
            System.out.println(divide(-22,-7));
        System.out.println(divide(-22,7));
        System.out.println(divide(22,-7));
        System.out.println(divide(22,3));
        System.out.println(divide(22,2));
    }
}
