package LeetcodeRevist.easy.Str;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
//    Given two strings s and t, determine if they are isomorphic.
//
//    Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//    All occurrences of a character must be replaced with another character while preserving the order of characters.
//    No two characters may map to the same character, but a character may map to itself.
//            Example 1:
//
//    Input: s = "egg", t = "add"
//    Output: true
//
//    Explanation:
//    The strings s and t can be made identical by:
//
//    Mapping 'e' to 'a'.
//    Mapping 'g' to 'd'.
//    Example 2:
//
//    Input: s = "foo", t = "bar"
//
//    Output: false
//
//    Explanation:
//
//    The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.
//
//    Example 3:
//
//    Input: s = "paper", t = "title"
//
//    Output: true
private static boolean isIsoMat(String s,String t){

    Map<Character,Integer> m = new HashMap<>();
    Map<Character,Integer> n = new HashMap<>();
    if(s.length()!=t.length()){
        return false;
    }
    for(int i=0;i<s.length();i++){
        if(!m.containsKey(s.charAt(i))){
            m.put(s.charAt(i),i);
        }
        if(!n.containsKey(t.charAt(i))){
            n.put(t.charAt(i),i);
        }

        if(m.get(s.charAt(i))!=n.get(t.charAt(i))){
            return false;
        }
    }
    return true;
}
    public static void main(String args[]){
    System.out.println("Input: s = \"egg\", t = \"add\""+isIsoMat("egg","add"));
    System.out.println("Input: s = \"foo\", t = \"bar\""+isIsoMat("foo","bar"));
    System.out.println("Input: s = \"paper\", t = \"title\" "+isIsoMat("paper","title"));

    }
}
