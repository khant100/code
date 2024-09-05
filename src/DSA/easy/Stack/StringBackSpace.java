package DSA.easy.Stack;

import java.util.Stack;

public class StringBackSpace {

    private static int nextChar(String str, int cur){
        while(cur > -1 && str.charAt(cur) == '#'){
            int cnt = 1;
            for(cur--; cur > -1 && cnt > 0; cur--)
                cnt += str.charAt(cur) == '#'? 1 : -1;
        }
        return cur;
    }

    public boolean backspaceCompareS(String s, String t) {
        int i = nextChar(s, s.length() - 1);
        int j = nextChar(t, t.length() - 1);

        while(i > -1 && j > -1){
            if(s.charAt(i) != t.charAt(j)) return false;
            i = nextChar(s, i - 1);
            j = nextChar(t, j - 1);
        }

        if(i == -1 && j == -1) return true;
        return false;
    }
    public void fillStack(String temp, Stack st){
        int s1=0;

        while(s1<temp.length()){

            if(temp.charAt(s1)!='#'){
                st.push(temp.charAt(s1));
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            s1++;

        }

    }
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        fillStack(s, st1);
        fillStack(t, st2);

        return st1.equals(st2);

    }
    public static void main(String args[]){
        StringBackSpace stringBackSpace = new StringBackSpace();
        String s1 = "ab#c";
        String s2 = "ad#c";
        System.out.println(" "+stringBackSpace.backspaceCompare(s1,s2));
        System.out.println(" "+stringBackSpace.backspaceCompareS(s1,s2));
    }

}
