package concept.DynamicProgramming;

public class RobberAdjecentHouseProblem {
//    Mr. X is a professional robber planning to rob houses along a street.
//    Each house has a certain amount of money hidden.All houses along this street are arranged
//    in a circle. That means the first house is the neighbour of the last one.
//    Meanwhile, adjacent houses have a security system connected, and
//    it will automatically contact the police if two adjacent houses
//    are broken into on the same night.
//    You are given an array/list of non-negative integers 'ARR' representing the amount
//    of money of each house. Your task is to return the maximum amount of money
//    Mr. X can rob tonight without alerting the police/

public static int tabultion(int[] giv){


    int[] dp1 = new int[giv.length-1];
    dp1[0]=giv[1];
    for(int i=2;i<giv.length;i++){
        int pick = giv[i];
        if(i>2){
            pick+=dp1[i-3];}
        int nonpick = dp1[i-2];
        dp1[i-1] = Math.max(pick,nonpick);
    }
    int[] dp2 = new int[giv.length-1];
    dp2[0]=giv[0];
    for(int i=1;i<giv.length-1;i++){
        int pick = giv[i];
       if(i>1){
        pick+=dp2[i-2];}
        int nonpick = dp2[i-1];
        dp2[i] = Math.max(pick,nonpick);
    }
     return Math.max(dp2[giv.length-2],dp1[giv.length-2]);
}

public static int SpaceOptimization(int[] arr){
    int prev1 = 0;
    int prev = arr[0];
    for(int i=1;i<arr.length-1;i++){
        int pick =prev;
        int uppick =prev1+arr[i];
        int curr = Math.max(pick,uppick);
        prev1=prev;
        prev=curr;
    }
    int prev3 = 0;
    int prev2 = arr[1];
    for(int i=2;i<arr.length;i++){
        int pick =prev2;
        int uppick =prev3+arr[i];
        int curr = Math.max(pick,uppick);
        prev3=prev2;
        prev2=curr;
    }

    return Math.max(prev2,prev);
}
    public static void main(String args[]){
        int[] arr = {1,5,1 ,2 ,6};
        int[] arr1 = {2,3,5};
        int[] dp = new int[arr.length];
        int[] dp1 = new int[arr1.length];
        System.out.println(tabultion(arr));
        System.out.println(tabultion(arr1));
        System.out.println(SpaceOptimization(arr));
        System.out.println(SpaceOptimization(arr1));

    }

}