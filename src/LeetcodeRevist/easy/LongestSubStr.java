package LeetcodeRevist.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestSubStr {
    //find longest common prefix

    //Input: strs = ["flower","flow","flight"]
    //Output: "fl"
    //Example 2:
    //
    //Input: strs = ["dog","racecar","car"]

    //Output: ""

    public static String longestCommonPrefix1(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();

        for(int i=0;i< Math.min(strs[0].length(),strs[strs.length-1].length());i++){
            if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i)){
                return sb.toString();
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
    public static String longestCommonPrefix(String[] strs) {
       String prefix= strs[0];

       for(String s:strs){
           while(s.indexOf(prefix)!=0){
               prefix=prefix.substring(0,prefix.length()-1);
           }
       }
    return prefix;

    }

    public static void main(String args[]){
        String[] s1 = {"flower","flow","flight"};
        String[] s2 = {"dog","racecar","car"};
        StringBuilder sb = new StringBuilder();
        Arrays.stream(s1).collect(Collectors.groupingBy(x->x,Collectors.counting()))
                        .entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
                        .forEach(x->{for(int i=0;i<x.getValue();i++){
                            sb.append(x.getKey());
                        }});
        System.out.println(longestCommonPrefix(s1));
        System.out.println(longestCommonPrefix(s2));
        System.out.println(longestCommonPrefix1(s1));
        System.out.println(longestCommonPrefix1(s2));
    }
}
