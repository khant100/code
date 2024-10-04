package DSACCodingInt.LinkedList;

public class SinglyLinkedList {

class Node{
    Node next;
    int data;

    Node(int data){
       this.data=data;
       this.next=null;
    }
}

Node head = null;

public void addNode(int data){
    Node node = new Node(data);

    if(head==null){
        head=node;
        head.next=null;
    }else{
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
    current.next=node;
    }

}

public void displayLinkList(){
    Node current = head;
    if(current==null) {
    System.out.println("List is empty");
    }else {
        while (current.next != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print(""+current.data);
        System.out.println();
    }
}


}
