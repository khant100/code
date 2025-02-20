package concept.Tris;


import DSACCodingInt.Searching.BinarySearch;

import java.util.Arrays;
import java.util.List;

class Node3{
    Node3[] links;
    boolean flag;
    Node3(){
        links=new Node3[26];
        flag=false;
    }

    public boolean cointainKey(char ch){
        return links[ch-'a']!=null;
    }

    public Node3 get(char ch){
        return links[ch-'a'];
    }

    public void put(char ch,Node3 node){
        links[ch-'a']=node;
    }

    public boolean isEnd(){
        return flag;
    }

    public void setEnd(){
        flag=false;
    }
}

class Tris0{
    Node3 root =new Node3();
    public void insert(String s){
        Node3 node=root;
        for(int i=0;i<s.length();i++){
            if(!node.cointainKey(s.charAt(i))){
                node.put(s.charAt(i),new Node3());
            }
            node=node.get(s.charAt(i));
        }
        node.setEnd();
    }

    public boolean containsAllString(String s){
        boolean flag = true;
        Node3 node3 =root;
        for(int i=0;i<s.length();i++){
            if(node3.cointainKey(s.charAt(i))){
                node3=node3.get(s.charAt(i));
                flag=flag&&node3.isEnd();
            }else{
                return false;
            }
        }
        return true;
    }

}
public class LongestStringWithAllPrefix {

    public String completeString(int n,List<String> given){
        Tris0 t = new Tris0();
        String longest = "";
        for(String s :given){
        t.insert(s);
        }
        for(int i=0;i<given.size();i++){
            if(t.containsAllString(given.get(i))){
                if(given.get(i).length()>longest.length()||(given.get(i).length()==longest.length())&&(given.get(i).compareTo(longest)<0)){
                    longest=given.get(i);
                }
            }
        }
        return longest==""?"None":longest;
    }
    public static void main(String[] args) {
        LongestStringWithAllPrefix l = new LongestStringWithAllPrefix();
        List<String> words = Arrays.asList("apple", "app", "ap", "apply", "bat", "bats", "ba");
        System.out.println(l.completeString(words.size(), words)); // Expected output: "apply"
    }
}
