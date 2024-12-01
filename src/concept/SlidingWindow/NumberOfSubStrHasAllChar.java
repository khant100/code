package concept.SlidingWindow;

//Given a string s consisting only of characters a, b and c.
//        Return the number of substrings containing at least one occurrence of all these characters a, b and c.
//        Example 1:
//        Input: s = "abcabc"
//        Output: 10
//        Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again).
//        Example 2:
//        Input: s = "aaacb"
//        Output: 3
//        Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb".
//        Example 3
//        Input: s = "abc"
//        Output: 1
public class NumberOfSubStrHasAllChar {
    public static int NumOfSubStr(String s){
        int i=0;int count=0; int a=-1;int b=-1;int c=-1;
        for(char ch: s.toCharArray()){
            if(ch=='a'){
                a=i;
            } else if (ch=='b') {
                b=i;
            }else{
                c=i;
            }

            count+=Math.min(a,Math.min(b,c))+1;
        i++;
        }
    return count;
    }
    public static void main(String args[]){
        System.out.println(NumOfSubStr("abcabc"));
        System.out.println(NumOfSubStr("aaacb"));
        System.out.println(NumOfSubStr("abc"));

    }
}
