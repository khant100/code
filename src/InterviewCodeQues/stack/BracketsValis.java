package InterviewCodeQues.stack;

import java.util.Stack;

public class BracketsValis {
// Question    ([{}])
//    You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.
//    The input string s is valid if and only if:
//    Every open bracket is closed by the same type of close bracket.
//    Open brackets are closed in the correct order.
//    Every close bracket has a corresponding open bracket of the same type.
//    Return true if s is a valid string, and false otherwise.

    private boolean Valid(String brackets){

        Stack<Character> stack = new Stack<>();
        for(Character c : brackets.toCharArray()){

            if(c=='{'||c=='['||c=='('){
                stack.push(c);
            } else if (c=='}'&& !stack.isEmpty() && stack.peek()=='{') {
                stack.pop();
            }
            else if (c==']'&& !stack.isEmpty() && stack.peek()=='[') {
                stack.pop();
            }
            else if (c==')'&& !stack.isEmpty()&& stack.peek()=='(') {
                stack.pop();
            }
            else{
                return false;
            }


        }

        return stack.isEmpty();

    }


    public static void main(String args[]){

        BracketsValis bras = new BracketsValis();

        String s = "(([{}]))[][]";
        String s1 = "(([{}])]";
        System.out.println("]["+"->"+bras.Valid("]["));
        System.out.println(s+"->"+bras.Valid(s));
        System.out.println(s1+"->"+bras.Valid(s1));

    }
}
