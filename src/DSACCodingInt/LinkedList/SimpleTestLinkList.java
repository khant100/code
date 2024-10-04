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
        SinglyLinkedList.Node node=singlyLinkedList.getLinkList(new int[]{2,1,3,4,5,4,5,6,7});
        singlyLinkedList.displayLinkList();
        singlyLinkedList.displayLinkList(node);

    }
}
