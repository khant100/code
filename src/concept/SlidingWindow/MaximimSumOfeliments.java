package concept.SlidingWindow;

public class MaximimSumOfeliments {


    //Maximum point obtained from picking card
    //either from back or from front consicutive k cards

    public static void main(String args[]){
        int[] arr ={6,2,3,4,7,2,1,7,1};
        int right=0;
        int k=4;
        int left =arr.length-k;
        int max=0;int sum=0;

        while (left<arr.length) {
            sum+=arr[left];
            left++;
        }
       // System.out.println(sum);
                max=Math.max(sum,max);
                while(right<k){
                    sum-=arr[arr.length-k-1+right];
                    //System.out.println(sum);
                    sum+=arr[right];
                   // System.out.println(sum);
                    max=Math.max(sum,max);
                    right++;
                }



    System.out.println(max);
    }
}
