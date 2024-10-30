package concept.DynamicProgramming;

import java.util.Arrays;

public class FrodJumpKth {


   public static int kJumps(int[] given,int k,int[] dp,int index){

       if(index==0){
           return 0;
       }

       if(dp[index]!=-1){
           return dp[index];
       }
       int mmstep =Integer.MAX_VALUE;
       for(int i=1 ;i<=k;i++){

           if(index-i>=0){
                int jump = kJumps(given,k,dp,index-i)+Math.abs(given[index]-given[index-i]);
                mmstep = Math.min(jump,mmstep);
           }

       }
return mmstep;
   }

   public static int tabulation(int[] given,int k,int[] dp){
       dp[0]=0;

       for(int i=1;i<given.length;i++){
           int temp = Integer.MAX_VALUE;
           for(int j=1;j<=k;j++){
               if(i-j>=0){
                   int jump =dp[i-j]+Math.abs(given[i]-given[i-j]);
                    temp =Math.min(temp,jump );
               }
               dp[i]=temp;
           }
       }


   return dp[given.length-1];

}


    public static void main(String args[]){


        int height[] = { 30, 10, 60, 10, 60, 50 };
        int n = height.length;
        int k = 2;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
       // System.out.println(kJumps(height,k,dp,n-1));
        System.out.println(tabulation(height,2,dp));



    }


}
