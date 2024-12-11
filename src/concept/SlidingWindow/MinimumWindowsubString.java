package concept.SlidingWindow;

import java.util.Arrays;

public class MinimumWindowsubString {


//    Given two strings s and t of lengths m and n respectively, return the minimum window
//            substring
//    of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
//
//    The testcases will be generated such that the answer is unique.
//
//
//
//            Example 1:
//
//    Input: s = "ADOBECODEBANC", t = "ABC"
//    Output: "BANC"
//    Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
//            Example 2:
//
//    Input: s = "a", t = "a"
//    Output: "a"
//    Explanation: The entire string s is the minimum window.
//    Example 3:
//
//    Input: s = "a", t = "aa"
//    Output: ""
//    Explanation: Both 'a's from t must be included in the window.
//    Since the largest window of s only has one 'a', return empty string.

public static String minWindow(String s,String t){
    if(s==null||t==null||(t.length()>s.length())){
        return "";
    }

    int minLen=Integer.MAX_VALUE;
    int right=0;
    int left=0;
    int[] map = new int[128];
    char[] ch=s.toCharArray();
    char[] cht = t.toCharArray();
    int count=0;
    int startInd=0;
    for (char c:cht){
        map[c]++;
    }
   // Arrays.stream(map).forEach(x->System.out.print(x));
    while(right<ch.length){

        if(map[ch[right++]]-->0){
            count++;
        }

        while(count==t.length()){
            if(right-left<minLen){
                minLen=right-left;
                startInd=left;
            }
            if(map[ch[left++]]++==0){
                count--;
            }

        }

    }

    Arrays.stream(map).forEach(x->System.out.print(x));
    return minLen==Integer.MAX_VALUE ? new String() : new String(ch,startInd,minLen);
}
    public static void main(String args[]){

        System.out.println(minWindow("ADOBECODEBANC","ABC"));
        System.out.println(minWindow("a","a"));
        System.out.println(minWindow("a","aa"));

    }
}
