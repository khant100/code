package DSACCodingInt.LinkedList;

public class LoopDetectionInLikedList {

private  SinglyLinkedList.Node loopCollidePoint(SinglyLinkedList.Node head){
    SinglyLinkedList.Node slow = head;
    SinglyLinkedList.Node fast = head;

    while(fast!=null&&fast.next!=null){
        slow = slow.next;
        fast=fast.next.next;
        if(slow==fast){
            SinglyLinkedList.Node slow2 = head;
            while(slow2!=slow){
                slow=slow.next;
                slow2=slow2.next;
            }
            return slow;
        }

    }
    return null;


}

    public static void main(String args[]){
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    LoopDetectionInLikedList l = new LoopDetectionInLikedList();
    SinglyLinkedList.Node node = singlyLinkedList.getLinkList(new int[]{2,3,5,7,9,10,44});
    SinglyLinkedList.Node curr = node;
    while(curr.next!=null){
        curr=curr.next;
    }
    curr.next=node.next;
    SinglyLinkedList.Node node2 = singlyLinkedList.getLinkList(new int[]{4,6,1,77,88});
    System.out.println(" "+l.loopCollidePoint(node).data);
    System.out.println(" "+l.loopCollidePoint(node2));


    }
}
