package DSA.medium.Maths;

public class BreakInteger {

    // break the integer to find maximum sum of product
    // eg 10 = 4* 3*3 = 36

    private int divFun(int x){
        if(x<=3){
            return x-1;
        }
       int ans = 1;

        while(x>4){
            ans = ans*3;
            x=x-3;
        }
        ans=ans*x;

        return ans;
    }


    public static void main(String args[]){
BreakInteger breakInteger = new BreakInteger();
        System.out.println("Max break of 11 is : "+breakInteger.divFun(11));
    }

}
