package concept.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutationO {

    public void printAll(int[] arr, int index, List<List<Integer>> ans){
        if(index==arr.length){
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                temp.add(arr[i]);
            }
            ans.add(new ArrayList<Integer>(temp));
        }

        for(int i=index;i<arr.length;i++){
            swap(arr,i,index);
            printAll(arr,index+1,ans);
            swap(arr,i,index);
        }

    }

    private void swap (int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void main(String args[]){
        List<List<Integer>> answer = new ArrayList<>();
        PrintAllPermutationO p = new PrintAllPermutationO();
        int[] arr = {1,2,3,4};
        p.printAll(arr,0,answer);
        answer.stream().forEach(x->System.out.println(x));

    }
}
