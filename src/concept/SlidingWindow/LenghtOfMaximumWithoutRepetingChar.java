package concept.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LenghtOfMaximumWithoutRepetingChar {

    public static int maxLen(String s){
        int left=0;
        int maxlen=0;
        int right=1;
        while(right<s.length()){
            char c = s.charAt(right);
            if(s.substring(left,right).contains(String.valueOf(c))){
                while(s.substring(left,right).contains(String.valueOf(c))){
                    left++;
                }
            }
            right++;
            maxlen=Math.max(maxlen,right-left);
        }
        return maxlen;
    }
    public static int maxLenO(String s){

        Map<Character,Integer> map = new HashMap<>();
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            if(map.containsKey(s.charAt(right))){
                left=Math.max(left,map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right),right);
            max=Math.max(max,right-left+1);
        }
    return max;
    }

    public static void main(String args[]){
        System.out.println(maxLen("abcabcbb"));
        System.out.println(maxLen("bbbbb"));
        System.out.println(maxLen("pwwkew"));
        System.out.println(maxLenO("abcabcbb"));
        System.out.println(maxLenO("bbbbb"));
        System.out.println(maxLenO("pwwkew"));
    }
}
