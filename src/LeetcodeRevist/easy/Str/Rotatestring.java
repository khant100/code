package LeetcodeRevist.easy.Str;

public class Rotatestring {

//    Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
//
//    A shift on s consists of moving the leftmost character of s to the rightmost position.
//
//    For example, if s = "abcde", then it will be "bcdea" after one shift.
//
//
//            Example 1:
//
//    Input: s = "abcde", goal = "cdeab"
//    Output: true
//    Example 2:
//
//    Input: s = "abcde", goal = "abced"
//    Output: false
//
//
//    Constraints:
    private static boolean isRotation(String s,String goal){
        for(int i=0;i<s.length();i++){
            String tem = s.substring(i,s.length())+s.substring(0,i);
            if(tem.equals(goal)){
                return true;
            }
        }
    return false;
    }
    public static void main(String args[]){

        System.out.println(" Input: s = \"abcde\", goal = \"cdeab\" "+isRotation("abcde","cdeab"));
        System.out.println(" Input: s = \"abcde\", goal = \"abced\" "+isRotation("abcde","adced"));

    }
}
