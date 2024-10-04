package DSACCodingInt.LinkedList;

public class LinkedListNode {
    public LinkedListNode(LinkedListNode next, LinkedListNode prev, int data, LinkedListNode last) {
        this.next = next;
        this.prev = prev;
        this.data = data;
        this.last = last;
    }

    LinkedListNode next;

    public LinkedListNode(LinkedListNode next, LinkedListNode prev, int data) {
        setNext(next);
        setPrev(prev);

        this.data = data;
    }

    public LinkedListNode(int data) {
        this.data = data;
    }

    public LinkedListNode() {

    }

    LinkedListNode prev;
    int data;
    LinkedListNode last;


    public void setNext(LinkedListNode n){
        next=n;
        if(this==last){
            n=last;
        }
        if(n!=null && n.prev==this){
            n.setPrev(this);
        }

    }

    public void setPrev(LinkedListNode p){
        prev=p;
        if(p!=null&&p.next!=this){
            p.setNext(this);
        }

    }


    public String printList(){
        if(next!=null){
            return data+"->"+ next.printList();
        }else {
            return String.valueOf(data);
        }
    }

    public LinkedListNode clone(){
        LinkedListNode next2 = null;
        if(next!=null){
            next2=next.clone();
        }
        LinkedListNode linkedListNode2 = new LinkedListNode(null,next2,data);
        return linkedListNode2;

    }
}
