package DSACCodingInt.DynamicProgramming;

import DSACCodingInt.Recursion.Fibonnaci;

public class Fibonacci {

    public int fibonnaci(int x,int[] dp){
        if(x==0||x==1){
            return x;
        }
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=x;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[x];

    }

    public static void main(String[] args){
        Fibonnaci fb = new Fibonnaci();
        System.out.println(" "+fb.fibonachi(8));
    }
}
