package DSACCodingInt.Queue;

import DSACCodingInt.Node;

public class MyQueue {
    Node head = null;
    Node tail=null;

    public void add(int data){
        Node node= new Node(data);
        if(head==null){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=node;
        }

    }

    public Node remove(){
        if(head==null){
            return null;
        }
        Node front = head;
        head = head.next;
        if(head==null){
            tail=null;
        }
        return front;
    }

    public Node Peek(){
        return head;
    }

}
