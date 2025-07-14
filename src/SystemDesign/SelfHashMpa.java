package SystemDesign;

import java.security.Key;

public class SelfHashMpa<K,V> {
    class Entry<K,V>{
        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        K key;
        V value;

        Entry next;
        Entry(K key , V value){
            this.key =key;
            this.value=value;
        }


    }
    final static int inti_capacity = 1<<4;
    final static int max_capacity = 1<<30;
    Entry[] hashmap;
    public SelfHashMpa(){
        hashmap = new Entry[inti_capacity];
    }

    final int tablesize(int cap){
        int n = cap-1;
        n|=n>>>1;
        n|=n>>>2;
        n|=n>>>4;
        n|=n>>>8;
        n|=n>>>16;
        return (n<0)?1:(n>max_capacity) ?max_capacity :n+1;
    }
}
