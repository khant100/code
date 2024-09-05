package InterviewCodeQues;
//Given an unsorted array A of size N that contains only non-negative integers,
 //       find a continuous sub-array that adds to a given number S and return
   //     the left and right index(1-based indexing) of that subarray.

     //   In case of multiple subarrays, return the subarray indexes
       //         which come first on moving from left to right.

  //      Note:- You have to return an ArrayList consisting of two elements left and right.
    //            In case no such subarray exists return an array consisting of element -1.

import java.util.ArrayList;

//N = 5, S = 12
//        A[] = {1,2,3,7,5}
//        Output: 2 4
//        Explanation: The sum of elements
//        from 2nd position to 4th position
//        is 12.
public class Problem1 {

    static ArrayList<Integer> subArray(int[] arry,int sum){

        ArrayList<Integer> ans = new ArrayList<>();
        int begin=0;
        int end=0;
        int join=0;
        for(int i=0;i<arry.length;i++){

            join=join+arry[i];

            if(join>sum){
                end=i;
                while(sum<join &&begin<end){
                    join=join-arry[begin];
                    begin=begin+1;
                }
            }
            if(join==sum){
                ans.add(begin+1);
                ans.add(i+1);
                break;
            }

        }
        if(ans.size()<1){
            ans.add(-1);
        }
        return ans;
    }

    public static void main(String args[]){

        int[] a = {1,2,3,7,5};
        System.out.println("arry"+subArray(a,12));

    }

}
