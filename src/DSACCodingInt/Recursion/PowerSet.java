package DSACCodingInt.Recursion;



/// generat powerset of given array

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    private  void helper(int index,int[] arry,List<List<Integer>> ans,List<Integer> temp){
        if(index==arry.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        helper(index+1,arry,ans,temp);
        temp.add(arry[index]);
        helper(index+1,arry,ans,temp);
        temp.remove(temp.size()-1);

    }

    private List<List<Integer>> powerset(int[] arry){
        List<List<Integer>> answer = new ArrayList<>();
        helper(0,arry,answer,new ArrayList<>());
        return answer;

    }

    public static void main(String args[]){

        int[] arry = {1,2,3};
        PowerSet p = new PowerSet();
        p.powerset(arry).stream().forEach(x->System.out.println(x));

    }
}
