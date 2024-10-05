package DSACCodingInt.LinkedList;

public class PartitationLikList {

    private SinglyLinkedList.Node part(SinglyLinkedList.Node head,int x)
    {
        SinglyLinkedList.Node curr=head;
        SinglyLinkedList.Node swap=head;

        while(curr!=null){
            if(curr.data<x){
                int temp = swap.data;
                swap.data=curr.data;
                curr.data=temp;
                swap=swap.next;

            }

            curr=curr.next;
        }

        return head;

    }

    private SinglyLinkedList.Node nonSwap(SinglyLinkedList.Node head,int x){
        SinglyLinkedList.Node h1 = null;
        SinglyLinkedList.Node t1 = null;
        SinglyLinkedList.Node h2 = null;
        SinglyLinkedList.Node t2 = null;

        while(head!=null){
            if(head.data<x){
                if (h1==null){
                    h1=head;
                    t1=head;
                }else{
                    t1.next=head;
                    t1=head;
                }

            }else{
                if (h2==null){
                    h2=head;
                    t2=head;
                }else{
                    t2.next=head;
                    t2=head;
                }
            }
            head=head.next;
        }
if(t2!=null){
    t2.next=null;
}
if(h1==null){
    return h2;
}
        t1.next=h2;
    return h1;
    }
    public static void main(String args[]){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        SinglyLinkedList.Node head=  singlyLinkedList.getLinkList(new int[]{2,9,1,4,3,8,7});
        singlyLinkedList.displayLinkList(head);
        PartitationLikList p = new PartitationLikList();
      SinglyLinkedList.Node par1=  p.part(head,5);
        SinglyLinkedList.Node par=  p.nonSwap(head,5);
        singlyLinkedList.displayLinkList(par1);
        singlyLinkedList.displayLinkList(par);



    }
}
