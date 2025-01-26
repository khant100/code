package concept.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AlianDictonary {
//    Problem Statement: Given a sorted dictionary of an alien language having N words and k starting alphabets of a standard dictionary. Find the order of characters in the alien language.
//
//            Note: Many orders may be possible for a particular test case, thus you may return any valid order.
//
//            Examples:
//
//    Example 1:
//    Input: N = 5, K = 4
//    dict = {"baa","abcd","abca","cab","cad"}
//    Output: b d a c
//    Explanation:
//    We will analyze every consecutive pair to find out the order of the characters.
//    The pair “baa” and “abcd” suggests ‘b’ appears before ‘a’ in the alien dictionary.
//    The pair “abcd” and “abca” suggests ‘d’ appears before ‘a’ in the alien dictionary.
//    The pair “abca” and “cab” suggests ‘a’ appears before ‘c’ in the alien dictionary.
//    The pair “cab” and “cad” suggests ‘b’ appears before ‘d’ in the alien dictionary.
//    So, [‘b’, ‘d’, ‘a’, ‘c’] is a valid ordering.
//
//    Example 2:
//    Input: N = 3, K = 3
//    dict = {"caa","aaa","aab"}
//    Output: c a b
//    Explanation: Similarly, if we analyze the consecutive pair
//for this example, we will figure out [‘c’, ‘a’, ‘b’] is
//    a valid ordering.

    public static List<Integer> topoSort(List<List<Integer>> adj , int k){
        int[] indegree =new int[k];
        for(int i=0;i<k;i++){
            for(int it : adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<k;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        List<Integer> topo = new ArrayList<>();
        while(!q.isEmpty()){
            Integer node = q.peek();
            q.remove();
            topo.add(node);

            for(int it : adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }
        return topo;
     }
    public static String findOrder(String[] dict,int n, int k) {

        List<List<Integer>> adj = new LinkedList<>();

        for(int i=0;i<k;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n-1;i++) {
            String s1 = dict[i];
            String s2 = dict[i +1 ];
            int min = Math.min(s1.length(), s2.length());
            for (int j = 0; j < min; j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    adj.get(s1.charAt(j) - 'a').add(s2.charAt(j) - 'a');
                    break;
                }
            }
        }
            List<Integer> tope = topoSort(adj,k);
            String ans ="";
            for(int it :tope){
                ans = ans+ (char)(it+(int)('a'));
            }


return ans;

    }



    public static void main(String args[]){

        int N = 5, K = 4;
        String[] dict = {"baa", "abcd", "abca", "cab", "cad"};
        AlianDictonary obj = new AlianDictonary();
        String ans = obj.findOrder(dict, N, K);

        for (int i = 0; i < ans.length(); i++) {
            System.out.print(ans.charAt(i) + " ");
        }
        System.out.println("");
    }

    }

