package DSACCodingInt.Stack;

import DSACCodingInt.Node;

public class MyStackConstruct {

   private Node top=null;

    public Node peek(){
        return top;
    }

    public void push(int data){
        Node n = new Node(data);
        n.next=top;
        top=n;
    }

    public Node pop(){
        Node n = top;
        top = top.next;
        n.next=null;
        return n;
    }


}
