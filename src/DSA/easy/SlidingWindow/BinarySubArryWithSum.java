package DSA.easy.SlidingWindow;

public class BinarySubArryWithSum {

    //Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.

//    A subarray is a contiguous part of the array.
//
//
//
//            Example 1:
//
//    Input: nums = [1,0,1,0,1], goal = 2
//    Output: 4
//    Explanation: The 4 subarrays are bolded and underlined below:
//            [1,0,1,0,1]
//            [1,0,1,0,1]
//            [1,0,1,0,1]
//            [1,0,1,0,1]
//    Example 2:
//
//    Input: nums = [0,0,0,0,0], goal = 0
//    Output: 15

    public static int binarySubArrySum(int[] arr,int k){
        return binnaryArry(arr,k)-binnaryArry(arr,k-1);
    }

    public static int binnaryArry(int[] arr,int k){
        int l=0;
        int sum=0;
        int count=0;
        if(k<0){
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while(sum>k){
                sum-=arr[l];
                l++;
            }
            count+=i-l+1;
        }
        return  count;
    }
    public static void main(String args[]) {


        System.out.println(binarySubArrySum(new int[]{1,0,1,0,1},2));
        System.out.println(binarySubArrySum(new int[]{0,0,0,0,0},0));
        System.out.println();
    }
}
