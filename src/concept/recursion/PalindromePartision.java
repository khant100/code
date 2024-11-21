package concept.recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartision {


    public void palinFunction(int index,List<List<String>> ans,List<String> temp,String s){
        if(index==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalin(s,index,i)){
                temp.add(s.substring(index,i+1));
                palinFunction(i+1,ans,temp,s);
                temp.remove(temp.size()-1);
            }
        }
    }

    public boolean isPalin(String s,int st,int ed){
        while(st<=ed){
            if(s.charAt(st++)!=s.charAt(ed--)){
                return false;
            }
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> lis = new ArrayList<>();
        List<String> tem = new ArrayList<>();
        palinFunction(0,lis,tem,s);
        return lis;
    }

    public static void main(String args[]){
        PalindromePartision p = new PalindromePartision();
        p.partition("aab").stream().forEach(x->System.out.println(x));

    }
}
