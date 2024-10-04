package DSACCodingInt.LinkedList;

public class SimpleTestLinkList {

    public static void main(String args[]){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.displayLinkList();
        singlyLinkedList.addNode(2);
        singlyLinkedList.displayLinkList();
        singlyLinkedList.addNode(5);
        singlyLinkedList.addNode(7);
        singlyLinkedList.addNode(9);
        singlyLinkedList.displayLinkList();
    }
}
