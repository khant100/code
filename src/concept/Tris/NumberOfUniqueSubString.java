package concept.Tris;

//Problem Statement: Implement a program that takes a string 'S' as input and returns the number
//        of distinct substrings of the given string,
//        including the empty substring. Use a trie data structure to accomplish this.
class Node2{
    Node2[] links;
    boolean flag;

    public boolean Containskey(char ch){
        return links[ch-'a']!=null;
    }

    public Node2 get(char ch){
        return links[ch-'a'];
    }

    public void put(char ch,Node2 node){
        links[ch-'a']=node;
    }

    public boolean isEnd(){
        return flag;
    }
    public Node2(){
        links = new Node2[26];
        flag=false;
    }

    public void setEnd(){
        flag=true;
    }

}

//class Tries2 {
//    Node2 root;
//
//    Tries2() {
//        root = new Node2();
//    }
//
//    public void insert(String s) {
//        Node2 node2 = root;
//        for (int i = 0; i < s.length(); i++) {
//            if (!node2.Containskey(s.charAt(i))) {
//                node2.put(s.charAt(i), new Node2());
//
//            }
//            node2 = node2.get(s.charAt(i));
//        }
//        node2.setEnd();
//    }
//}
public class NumberOfUniqueSubString {

    public static int countDistinctSubstrings(String s) {
        Node2 root = new Node2();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            Node2 node = root;
            for (int j = i; j < s.length(); j++) {
                if (!node.Containskey(s.charAt(j))) {
                    node.put(s.charAt(j),new Node2());
                    count++;
                }
                node = node.get(s.charAt(j));
            }

        }
        return count+1;
    }

    public static void main(String[] args) {
        String s = "striver";
        // Input string
        System.out.println("Current String: " + s);
        System.out.println("Number of distinct substrings: " + countDistinctSubstrings(s));
        // Output the result
    }
}

