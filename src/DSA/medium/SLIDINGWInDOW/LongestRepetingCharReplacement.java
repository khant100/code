package DSA.medium.SLIDINGWInDOW;

//You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
//
//        Return the length of the longest substring containing the same letter you can get after performing the above operations.
//
//
//
//        Example 1:
//
//        Input: s = "ABAB", k = 2
//        Output: 4
//        Explanation: Replace the two 'A's with two 'B's or vice versa.
//        Example 2:
//
//        Input: s = "AABABBA", k = 1
//        Output: 4
//        Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
//        The substring "BBBB" has the longest repeating letters, which is 4.
//        There may exists other ways to achieve this answer too.
public class LongestRepetingCharReplacement {

    private static int longestReptingChar(String s, int k){
        int left=0;
        int[] hash = new int[26];
        char[] ch = s.toCharArray();
        int max=0;
        for(int right=0;right<s.length();right++){
            hash[ch[right]-'A']++;
            max=Math.max(max,hash[ch[right]-'A']);

            while((right-left+1)-max>k){
                hash[ch[left]-'A']--;
                left++;
            }

        }
        return ch.length-left;
    }
    public static void main(String args[]){

        System.out.println(longestReptingChar("AABABBA",1));
        System.out.println(longestReptingChar("ABAB",2));
       // System.out.println(longestReptingChar());

    }
}
