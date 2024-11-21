package InterviewCodeQues.Array;

import java.util.HashMap;

public class FindlargestSumOfsequence {

    public static void Printmax(int[] arr){
        int right=1;
        int left=0;
        int sum=arr[0];
        int max=0;
        HashMap<Integer,Integer> m = new HashMap();
        while(right<arr.length){
            sum+=arr[right];
            if(arr[right]<arr[right-1]){
                m.put(sum-arr[right],left);
                left=right;
                sum=arr[right];
            }
            right++;
            max=Math.max(sum,max);
        }
    System.out.println("start Index= "+m.get(max)+"max= "+max);

    }

    public static void main(String args[]){
        int[] arr = {1,2,6,4,8,3,5,1,7,11,5,6};
        Printmax(arr);

    }
}
