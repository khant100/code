package concept.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCombiNoduplicate {

    private void combo(int index,int[] arr,int target,List<List<Integer>> ans,List<Integer> temp){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]) continue;
            if(arr[i]>target)break;

            temp.add(arr[i]);
            combo(i+1,arr,target-arr[i],ans,temp);
            temp.remove(temp.size()-1);
        }
    }



    public static void main(String args[]){
        int[] arr = {10,1,2,7,6,1,5};
        List<List<Integer>> res = new ArrayList<>();
        LeetCombiNoduplicate l = new LeetCombiNoduplicate();
        Arrays.sort(arr);
        l.combo(0,arr,8,res,new ArrayList<>());
        res.stream().forEach(x->System.out.println(x));
    }
}
