package DSACCodingInt.LinkedList;

public class SinglyLinkedList {

static class Node{
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

    public void displayLinkList(Node node){
        Node current = node;
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

public Node getLinkList(int[] arr){
    Node fst = new Node(arr[0]);
    Node local = fst;
    int i=1;

    while(i<arr.length){
        Node node = new Node(arr[i]);
        local.next=node;
        local=local.next;
        i++;
    }
//    local.data=arr[arr.length-1];
//    local.next=null;
    return fst;
}

public int getSize(Node fst){
    int size =0;
    Node curr = fst;
    while (curr!=null){
        size++;
        curr=curr.next;

    }
    return size;
}

}
