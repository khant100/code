package concept.DynamicProgramming;

import java.util.Arrays;

public class SumOFAdj {
    //You are given an array/list of ‘N’ integers.
    // You are supposed to return the maximum sum of the subsequence
    // with the constraint that no two elements are adjacent in the given array/list.

    public static int sumAdjecent(int[] given,int index,int[] dp){
        if(index==0){
            return given[index];
        }

        if(index<0){
            return 0;
        }

        if(dp[index]!=-1){
            return dp[index];
        }

        int pick = given[index]+sumAdjecent(given,index-2,dp);
        int  nonpick = 0+sumAdjecent(given,index-1,dp);
        return dp[index]= Math.max(pick,nonpick);
    }

    public static int sumTabulation(int[] given,int[] dp){

        dp[0]=given[0];
        for(int i=1;i<given.length;i++){
            int pick= given[i];
                    if(i>1) {
                       pick=pick+dp[i-2];
                    }
            int unpick =dp[i-1];
            dp[i]=Math.max(pick,unpick);
        }

        return dp[given.length-1];
    }

   public static int spaceOptimize(int[] given){

        int prev2=0;
        int prev =given[0];

        for(int i=1;i<given.length;i++){
            int pick = prev2+given[i];
            int unpick = prev;
            int curr = Math.max(pick,unpick);
            prev2=prev;
            prev=curr;
        }
        return prev;

   }
    public static void main(String args[]){

        int[] given = {2, 1, 4, 9};
        int[] dp = new int[given.length];
        int[] dp1 = new int[given.length+1];
        Arrays.fill(dp,-1);
       System.out.println( sumAdjecent(given,given.length-1,dp));
        System.out.println( sumTabulation(given,dp1));
        System.out.println(spaceOptimize(given));

    }




}
