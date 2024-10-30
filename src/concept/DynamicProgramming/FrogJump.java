package concept.DynamicProgramming;

public class FrogJump {

public void minumumEnergy(int[] given,int index,int[] dp){
    if(given.length==0){
        return ;
    }
    if (given.length==1){
        return ;
    }
    if(index==given.length){
        return ;
    }

        int left = dp[index - 1] + Math.abs(given[index] - given[index-1]);
        int right = dp[index - 2] + Math.abs(given[index] - given[index-2]);


    dp[index] = Math.min(left, right);
        minumumEnergy(given,index+1,dp);

}

    public void minumumEnergyForLoop(int[] given,int[] dp){

            for (int i = 2; i < given.length; i++) {
                int left = dp[i - 1] + Math.abs(given[i] - given[i - 1]);
                int right = dp[i - 2] + Math.abs(given[i] - given[i - 2]);
                dp[i] = Math.min(left, right);
            }
    }

    public void minumumEnergySpaceOptimization(int[] given,int prev,int prev2){


        for (int i = 2; i < given.length; i++) {
            int left = prev + Math.abs(given[i] - given[i - 1]);
            int right = prev2 + Math.abs(given[i] - given[i - 2]);
            int curr = Math.min(left, right);
            prev2=prev;
            prev=curr;
        }
    }
    public static void main(String args[]){
        int[] given = {30,10,60,10,60,50};
        FrogJump f = new FrogJump();
        int[] dp = new int[given.length+1];

        dp[0]=0;
        dp[1]=Math.abs(given[1]-given[0]);
        int prev2=0;
        int prev=dp[1];
        //f.minumumEnergy(given,2,dp);
        f.minumumEnergyForLoop(given,dp);
        System.out.println("minimum enery required->"+dp[given.length-1]);
        for (int i = 2; i < given.length; i++) {
            int left = prev + Math.abs(given[i] - given[i - 1]);
            int right = prev2 + Math.abs(given[i] - given[i - 2]);
            int curr = Math.min(left, right);
            prev2=prev;
            prev=curr;
        }

       System.out.println("minimum enery required->"+prev);

    }
}
