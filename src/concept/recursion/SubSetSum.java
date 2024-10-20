package concept.recursion;


// find subset sum example
// array [3,1,2]  {3} {1} {2} {3,1} {3,2} {1,2} {3,1,2} {} these are all subset
// sum is {3,1,2,4,5,3,6,0} 0 for empty set


import java.util.ArrayList;

public class SubSetSum {
    private void subsetsum(int[] arr,int n,int index,int sum,ArrayList<Integer> res){
        if(index==n){
            res.add(sum);
            return;
        }
        // when include element
        subsetsum(arr,n,index+1,sum+arr[index],res);

        subsetsum(arr,n,index+1,sum,res);

    }
    public static void main(String args[]){
        SubSetSum ss = new SubSetSum();
        int[] arr = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        ss.subsetsum(arr,3,0,0,list);
        list.stream().sorted().forEach(x->System.out.println("->"+x));
    }
}
