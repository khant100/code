package DSACCodingInt.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationOFStringWithDuplicates {

    private void permute(char[] arr,StringBuilder temp,List<String> ans,boolean[] v){
        if(temp.length()==arr.length){
            ans.add(temp.toString());
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(v[i]||(i>0&&arr[i]==arr[i-1]&&!v[i-1])){
                continue;}

            v[i]=true;
            temp.append(arr[i]);
            permute(arr,temp,ans,v);
            temp.deleteCharAt(temp.length()-1);
            v[i]=false;


        }

    }



    public static void main(String args[]){

        String s = "abca";
        List<String> ans = new ArrayList<>();
        char[] a = s.toCharArray();
        Arrays.sort(a);
        PermutationOFStringWithDuplicates P = new PermutationOFStringWithDuplicates();
        boolean[] v = new boolean[a.length];
        P.permute(a,new StringBuilder(),ans,v);
        ans.stream().forEach(x->System.out.println(x));

    }
}
