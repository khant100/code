package LeetcodeRevist.easy.Str;

import java.util.Stack;

public class RemoveOuterParen {
//    Input: s = "(()())(())"
//    Output: "()()()"
//    Explanation:
//    The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
//    After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
//    Example 2:
//
//    Input: s = "(()())(())(()(()))"
//    Output: "()()()()(())"
//    Explanation:
//    The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
//    After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
//    Example 3:
//
//    Input: s = "()()"
//    Output: ""
//    Explanation:
//    The input string is "()()", with primitive decomposition "()" + "()".
//    After removing outer parentheses of each part, this is "" + "" = "".

    private static String removeOutParen(String s){
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(stack.size()>0){
                    sb.append(s.charAt(i));
                }
                stack.push('(');
            }else{
                stack.pop();
                if(stack.size()>0){
                    sb.append(s.charAt(i));
                }


            }

        }
        return sb.toString();
    }
    public static void main(String args[]){

        System.out.println(removeOutParen("(()())(())"));
        System.out.println(removeOutParen("(()())(())(()(()))"));
        System.out.println(removeOutParen("()()"));
    }
}
