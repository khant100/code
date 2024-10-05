package DSACCodingInt.LinkedList;

public class DeleteGivenNodeList {

    private void deleteGivenNode(SinglyLinkedList.Node node){
        // you cannot delete last node
        if(node==null&&(node.next==null)){

        }else{
            node.data=node.next.data;
            node.next=node.next.next;
        }
    }

    public static void main(String args[]) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        SinglyLinkedList.Node given=singlyLinkedList.getLinkList(new int[]{2,4,6,7,9,1,5,7,8,9});
        singlyLinkedList.displayLinkList(given);
        DeleteGivenNodeList deleteGivenNodeList = new DeleteGivenNodeList();
        SinglyLinkedList.Node nodeTodelete=given;
        deleteGivenNodeList.deleteGivenNode(nodeTodelete);
        singlyLinkedList.displayLinkList(given);

    }
}
