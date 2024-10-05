package DSACCodingInt.LinkedList;

public class SummList {


    private SinglyLinkedList.Node sumList(SinglyLinkedList.Node n1,SinglyLinkedList.Node n2){
        SinglyLinkedList.Node head= new SinglyLinkedList.Node(0);
        SinglyLinkedList.Node tail = head;
        int carray=0;
        while(n1!=null||n2!=null||carray!=0){
            int value=carray;
            if(n1!=null){
                value+= n1.data;
                n1=n1.next;
            }
            if (n2!=null){
                value+=n2.data;
                n2=n2.next;
            }
            int digit = value%10;
             carray = value/10;
            tail.next=new SinglyLinkedList.Node(digit);
            tail=tail.next;
        }
        return head.next;
    }

    public static void main(String args[]){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        SummList s = new SummList();
        SinglyLinkedList.Node node=s.sumList(singlyLinkedList.getLinkList(new int[]{1,2,6,8,9}),singlyLinkedList.getLinkList(new int[]{1,2,6,8,9}));
        singlyLinkedList.displayLinkList(singlyLinkedList.getLinkList(new int[]{1,2,6,8,9}));
        singlyLinkedList.displayLinkList(singlyLinkedList.getLinkList(new int[]{1,2,6,8,9}));
        singlyLinkedList.displayLinkList(node);

    }
}
