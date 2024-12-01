package concept.SlidingWindow;

public class NumOfNiceArray {

//    Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.
//
//    Return the number of nice sub-arrays.
//
//
//
//            Example 1:
//
//    Input: nums = [1,1,2,1,1], k = 3
//    Output: 2
//    Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
//    Example 2:
//
//    Input: nums = [2,4,6], k = 1
//    Output: 0
//    Explanation: There are no odd numbers in the array.
//    Example 3:
//
//    Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
//    Output: 16


    public static int noOfNiceArray(int[] arr,int k){
        int l=0;
        int sum=0;int cnt=0;
        if(k<0){
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]&1;
            while(sum>k){
                sum-=arr[l]&1;
                l++;
            }
            cnt+=i-l+1;
        }
return cnt;
    }
    public static void main(String args[]){
        int[] arr = {1,1,2,1,1};int k=3;
        System.out.println(noOfNiceArray(arr,k)-noOfNiceArray(arr,k-1));
        System.out.println(noOfNiceArray(new int[]{2,4,6},1)-noOfNiceArray(new int[]{2,4,6},0));
        System.out.println(noOfNiceArray(new int[]{2,2,2,1,2,2,1,2,2,2},2)-noOfNiceArray(new int[]{2,2,2,1,2,2,1,2,2,2},1));

    }
}
