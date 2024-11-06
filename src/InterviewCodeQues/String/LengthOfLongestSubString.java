package InterviewCodeQues.String;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LengthOfLongestSubString

{

    public static int brutforce(String s){
        Map<String,Integer> m = new HashMap<>();
        int j=0;
        for(int i=1;i<s.length();i++){

            char c = s.charAt(i);
            if(s.substring(j,i).contains(String.valueOf(c))){
                m.put(s.substring(j,i),i-j);
               j++;
            }
        }
    m.entrySet().stream().forEach(x->System.out.println(x));
      return   m.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).stream().collect(Collectors.toList()).get(0).getValue();
    }

    public static int longest(String s){

        int maxlen=0;
        int right= 1;
        int left=0;
        while(right<s.length()){
            char c = s.charAt(right);
            if(s.substring(left,right).indexOf(String.valueOf(c))>-1){
                while(s.substring(left,right).indexOf(String.valueOf(c))>-1){
                    left++;
                }
            }
            right++;
            maxlen=Math.max(maxlen,right-left);
        }
        return maxlen;
    }

    public static void main(String[] args) {
//        System.out.println(longest("abcabcab"));
//        System.out.println(longest("bbb"));
//        System.out.println(longest("pkwepwka"));
        System.out.println(brutforce("abcabcab"));
        System.out.println(brutforce("bbb"));
        System.out.println(brutforce("pkwepwka"));
    }
}
