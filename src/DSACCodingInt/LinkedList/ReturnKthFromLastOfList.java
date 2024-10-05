package DSACCodingInt.LinkedList;

public class ReturnKthFromLastOfList{

    private SinglyLinkedList.Node getKthElem(SinglyLinkedList.Node head,int k){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        int size = singlyLinkedList.getSize(head);
        if(k<0||k>size){
            return null;
        }
        SinglyLinkedList.Node curr = head;
        int kth = size-k;
        for(int i=1;i<=kth;i++){
            curr=curr.next;
        }
        return curr;
    }
    public static void main(String args[]){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        SinglyLinkedList.Node head=singlyLinkedList.getLinkList(new int[]{2,3,4,6,18,22,5,7,88});
        ReturnKthFromLastOfList r = new ReturnKthFromLastOfList();
        singlyLinkedList.displayLinkList(head);

        System.out.println(" "+r.getKthElem(head,6).data);
        System.out.println(" "+r.getKthElem(head,9).data);
        //System.out.println(" "+r.getKthElem(head,20).data);
        System.out.println(" "+r.getKthElem(head,2).data);


    }
}
