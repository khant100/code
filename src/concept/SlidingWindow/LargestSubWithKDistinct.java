package concept.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LargestSubWithKDistinct {

    public static int LSubWithKFor(String s,int k){
        int left=0;
        int maxlen =0;
        Map<Character,Integer> imap = new HashMap<>();
    for(int i=0;i<s.length();i++){
        char a = s.charAt(i);
        imap.put(a,imap.getOrDefault(a,0)+1);
        while(imap.size()>k){
            char c = s.charAt(left);
            imap.put(c,imap.get(c)-1);
            if(imap.get(c)==0){
                imap.remove(c);
            }
            left++;
        }
        maxlen = Math.max(maxlen, i-left+1);
    }
    return maxlen;
    }
public static int LSubWithK(String s,int k){
    int left=0;
    int right=0;
    int maxlen =0;
    Map<Character,Integer> imap = new HashMap<>();
    while(right<s.length()){
        char c = s.charAt(right);

            imap.put(c,imap.getOrDefault(c,0)+1);

            while(imap.size()>k){
                char l = s.charAt(left);

                imap.put(l,imap.get(l)-1);
                if(imap.get(l)==0){
                    imap.remove(l);
                }
                left++;
            }

        right++;
        maxlen=Math.max(maxlen,right-left);

    }
    return maxlen;
}
    public static void main(String args[]){
        String s = "aaabbccd";
        int k=2;
        System.out.println(LSubWithK(s,k));
        System.out.println(LSubWithKFor(s,k));
    }
}
