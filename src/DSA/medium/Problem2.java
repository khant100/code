package DSA.medium;
//Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number)
//        which has the maximum sum and return its sum.
public class Problem2 {
   static long maxSubarraySum(int arr[], int n){

        int currentSum=arr[0];
        int maximumSum=arr[0];

        for(int i=1;i<n;i++){
            if(currentSum+arr[i]<arr[i]){
                currentSum=arr[i];
            }else{
                currentSum=currentSum+arr[i];
            }


            if(currentSum>maximumSum){
                maximumSum=currentSum;
            }

        }

        return maximumSum;

    }
    public static void main(String args[]){

        int[] a = {-1,-2,-3,-4};
        int[] b = {1,2,3,-2,5};
        System.out.println("Max Sum "+maxSubarraySum(a,4));
        System.out.println("Max Sum "+maxSubarraySum(b,5));

    }
}
