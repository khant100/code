package LeetcodeRevist.easy;

public class LongestSubStr {
    //find longest common prefix

    //Input: strs = ["flower","flow","flight"]
    //Output: "fl"
    //Example 2:
    //
    //Input: strs = ["dog","racecar","car"]
    //Output: ""

    public static String longestCommonPrefix(String[] strs) {
       String prefix= strs[0];

       for(String s:strs){
           while(s.indexOf(prefix)!=0){
               prefix=prefix.substring(0,prefix.length()-1);
           }
       }
    return prefix;

    }

    public static void main(String args[]){
        String[] s1 = {"flower","flow","flight"};
        String[] s2 = {"dog","racecar","car"};

        System.out.println(longestCommonPrefix(s1));
        System.out.println(longestCommonPrefix(s2));
    }
}
