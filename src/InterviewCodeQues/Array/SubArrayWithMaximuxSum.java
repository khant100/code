package InterviewCodeQues.Array;

//    Given an array input[], the task is to find the subarray that has the maximum sum and return its sum.
//
//    Input: arr[] = {2, 3, -8, 7, -1, 2, 3}
//    Output: 11
//    Explanation: The subarray {7, -1, 2, 3} has the largest sum 11
public class SubArrayWithMaximuxSum {

    private int maxArraySum(int[] arr){
        int maxseq = arr[0];
        int maxofall = arr[0];

        for(int i=1;i<arr.length;i++){
            maxseq = Math.max(arr[i],maxseq+arr[i]);

            maxofall = Math.max(maxofall,maxseq);

        }
        return maxofall;



    }


    public static void main(String[] args) {
        SubArrayWithMaximuxSum s = new SubArrayWithMaximuxSum();
        int[] given = {2, 3, -8, 7, -1, 2, 3};
        int[] giv2 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(" maximum sum is "+s.maxArraySum(given));
        System.out.println(" maximum sum is "+s.maxArraySum(giv2));

    }
}
