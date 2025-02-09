package concept.Tris;

import concept.Graph.NumberOfEnclaves;

public class TrisInsertSearch {

    static class Node {
        Node[] links = new Node[26];

        boolean flag= false;

        public boolean containSKey(char ch){
            return links[ch-'a']!=null;
        }

        public void putChar(char ch, Node node){
            links[ch-'a']=node;
        }

        public Node get(char ch){
            return links[ch-'a'];
        }
        public void setEnd(){
            flag=true;
        }

        public boolean isEnd(){
            return false;
        }

    }

    private Node root;
    public TrisInsertSearch(){
        root = new Node();
    }

    public void insert(String word){
        Node node = root;
        for(int i=0;i<word.length();i++){
            if(!node.containSKey(word.charAt(i))){
                node.putChar(word.charAt(i),new Node());
            }
            node=node.get(word.charAt(i));
        }
        node.setEnd();
    }

    public boolean search(String word){
        Node node = root;
        for(int i=0;i<word.length();i++){
            if(!node.containSKey(word.charAt(i))){
                return false;
            }
            node = node.get(word.charAt(i));
        }
        return node.isEnd();
    }

    public boolean startsWith(String word){
        Node node = root;
        for(int i=0;i<word.length();i++){
            if(!node.containSKey(word.charAt(i))){
                return false;
            }
            node = node.get(word.charAt(i));
        }
        return true;
    }
    public static void main(String[] args) {
        TrisInsertSearch trie = new TrisInsertSearch();
        System.out.println("Inserting words: Striver, Striving, String, Strike");
        trie.insert("striver");
        trie.insert("striving");
        trie.insert("string");
        trie.insert("strike");

        System.out.println("Search if Strawberry exists in trie: " +
                (trie.search("strawberry") ? "True" : "False"));

        System.out.println("Search if Strike exists in trie: " +
                (trie.search("strike") ? "True" : "False"));

        System.out.println("If words in Trie start with Stri: " +
                (trie.startsWith("stri") ? "True" : "False"));
    }
}
