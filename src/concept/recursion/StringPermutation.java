package concept.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StringPermutation {

    public static void permute(StringBuilder temp,List<String> ans,String s,boolean[] vis){
        if(temp.length()==s.length()){
            ans.add(temp.toString());
        }
        for(int i=0;i<s.length();i++){
            if(vis[i]==false) {
                vis[i]=true;
                temp.append(s.charAt(i));
                permute(temp, ans, s, vis);
                temp.deleteCharAt(temp.length() - 1);
                vis[i]=false;
            }
        }
    }

    public static void
    main(String agrs[]){
        String s = "123";
        boolean[] v = new boolean[s.length()];
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int pac=IntStream.rangeClosed(2,3).reduce(1,(x,y)->x*y);
        System.out.println(pac);
                 permute(sb,ans,s,v);
                 ans.stream().forEach(x->System.out.println(x));
    }
}
