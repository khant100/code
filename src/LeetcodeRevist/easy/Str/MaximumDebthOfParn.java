package LeetcodeRevist.easy.Str;

public class MaximumDebthOfParn {
//    Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.
//    Example 1:
//
//    Input: s = "(1+(2*3)+((8)/4))+1"
//
//    Output: 3
//
//    Explanation:
//
//    Digit 8 is inside of 3 nested parentheses in the string.
//
//            Example 2:
//
//    Input: s = "(1)+((2))+(((3)))"
//
//    Output: 3
//
//    Explanation:
//
//    Digit 3 is inside of 3 nested parentheses in the string.
//
//            Example 3:
//
//    Input: s = "()(())((()()))"
//
//    Output: 3
    private static int paranThesis(String s){
        int count=0;
        int max=0;
        for(char c : s.toCharArray()){
            if(c=='('){
                count++;
            }
            max=Math.max(count,max);
            if(c==')'){
                count--;
            }
        }
        return max;
    }
    public static void main(String args[]){

        System.out.println(paranThesis("(1+(2*3)+((8)/4))+1"));
        System.out.println(paranThesis("(1)+((2))+(((3)))"));
        System.out.println(paranThesis("()(())((()()))"));

    }
}

