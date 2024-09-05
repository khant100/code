package DSA.medium.twopointer;

import java.util.ArrayList;
import java.util.List;

public class PartisionLable {

    public List<Integer> partitionLabels(String s) {

        // using the 26 magic
        int n = s.length();
        int end = 0; // the end of each max last endex
        int [] lastIndex = new int [26];
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++){
            lastIndex [s.charAt(i) - 'a'] = i;
            System.out.println(s.charAt(i)+" : "+(s.charAt(i) - 'a'));
            // this will be the last index of each characters
        }
        int prev = 0;
        for (int j = 0; j < n; j++){
            end = Math.max(end, lastIndex[s.charAt(j) - 'a']);
            System.out.println(end+": "+s.charAt(j)+": "+lastIndex[s.charAt(j) - 'a']);
            if (end == j) {
                ans.add(end + 1- prev);
                prev = j + 1;
            }
        }
        return ans;




    }

    public static void main(String args[]){
        PartisionLable partisionLable = new PartisionLable();
        System.out.println(partisionLable.partitionLabels("ababcbacadefegdehijhklij"));
    }
}
