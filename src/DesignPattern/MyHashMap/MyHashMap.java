package DesignPattern.MyHashMap;

public class MyHashMap <K,V> {
    private static final int init_size = 1 << 4;//16
    private static final int max_size = 1 << 30;

     public Entry [] hashtable;

    public MyHashMap() {
        hashtable = new Entry[init_size];
    }
    public MyHashMap(int capacity) {
        int tableSize = tableSizefor(capacity);
        hashtable = new Entry[init_size];
    }

    final int tableSizefor(int cap){
        int n = cap-1;
        n |= n>>>1;
        n |= n>>>2;
        n |= n>>>4;
        n |= n>>>8;
        n |= n>>>16;
        return(n<0) ? 1 :(n>=max_size) ? max_size : n+1;
    }
    class Entry<K,V>{
        public K key;
        public V value;
        public Entry next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    public  void put (K key, V value){
        int hashcode = key.hashCode() % hashtable.length;
        Entry node = hashtable[hashcode];

        if(node==null){
            Entry newNode = new Entry(key,value);
            hashtable[hashcode]=newNode;
        }else{
            Entry previousNode = node;
            while (node!=null){
                if(node.key==key){
                node.value=value;
                return;
            }
            previousNode=node;
            node=node.next;
        }
            Entry newNode = new Entry(key,value);
            previousNode.next=newNode;
        }
    }

public V get(K key){
        int hashcode = key.hashCode()%hashtable.length;
       Entry node = hashtable[hashcode];
       while(node!=null){
           if(node.key.equals(key)){
               return (V) node.value;
           }
        node=node.next;
       }
       return null;
}
    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(2,"abcd");
        hashMap.put(3,"bbc");
        hashMap.put(4,"add");
        hashMap.put(6,"sub");
        hashMap.put(8,"adv");
        hashMap.put(9,"mba");
        hashMap.put(11,"CA");
        hashMap.put(11,"BA");

        System.out.println(" : "+hashMap.get(11));

    }


}