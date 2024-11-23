package DSACCodingInt.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllpermutationOfStringNoDuplicate {

    private void permute(String s,String temp,List<String> ans) {
        if (s.length() == 0) {
            ans.add(temp);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String answer = s.substring(0, i)
                    + s.substring(i + 1, s.length());
            permute(answer, temp + c, ans);

        }
    }

        private void permute(int index,String s,List<String > ans,String temp,int[] v){
       if(temp.length()==s.length()){
           ans.add(temp);
           return;
       }
       for(int i=0;i<s.length();i++){
          // swap(i,index,s);
           if(v[i]==0) {
               temp = temp + s.charAt(i);
               v[i]=1;
               permute(index + 1, s, ans, temp,v);
               temp = temp.substring(0, temp.length() - 1);
               v[i]=0;
           }
       }

    }

//    private String swap(int i,int j,String s){
//
//       char[] a = s.toCharArray();
//       char c=a[i];
//       a[i]=a[j];
//       a[j]=c;
//      s= Arrays.toString(a);
//      return s;
//    }
    public static void main(String[] args){
       String s ="abc";
       String g = "xyz";
       List<String> answer = new ArrayList<>();
       List<String> answer1 = new ArrayList<>();
       AllpermutationOfStringNoDuplicate a = new AllpermutationOfStringNoDuplicate();
        int[] v = new int[s.length()];
      a.permute(0,s,answer,new String(),v);
      a.permute(g,"",answer1);
      answer.stream().forEach(x->System.out.println(x));

      answer1.stream().forEach(x->System.out.println(x));

    }
}
