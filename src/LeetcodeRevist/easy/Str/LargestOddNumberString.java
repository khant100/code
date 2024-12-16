package LeetcodeRevist.easy.Str;

import java.security.PrivateKey;

public class LargestOddNumberString {
//    Example 1:
//
//    Input: num = "52"
//    Output: "5"
//    Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
//            Example 2:
//
//    Input: num = "4206"
//    Output: ""
//    Explanation: There are no odd numbers in "4206".
//    Example 3:
//
//    Input: num = "35427"
//    Output: "35427"
//    Explanation: "35427" is already an odd number.

    private static String  LargestOdd(String s){
        if(s.charAt(s.length()-1)%2==1){
            return s;
        }
        int i=s.length()-1;
        while(i>=0){

            if(s.charAt(i)%2==1){
                return s.substring(0,i+1);
            }
            i--;
        }
        return "";
    }
    public static void main(String args[]){

        System.out.println("35427 "+LargestOdd("35427"));
        System.out.println("52 "+LargestOdd("52"));
        System.out.println("4026 "+LargestOdd("4026"));
    }
}
