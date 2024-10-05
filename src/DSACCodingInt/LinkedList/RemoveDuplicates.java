package DSACCodingInt.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {


    private  void removedups(SinglyLinkedList.Node head){
        SinglyLinkedList.Node current = head;
        Set<Integer> s = new HashSet();
        s.add(head.data);
        while(current.next!=null){
            if(s.contains(current.next.data)){
                current.next=current.next.next;
            }else{
                s.add(current.next.data);
                current=current.next;
            }
        }

    }
    public static void main(String args[]){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
       SinglyLinkedList.Node node= singlyLinkedList.getLinkList(new int[]{1,3,2,4,6,2,6,7,3,7,1});
       singlyLinkedList.displayLinkList(node);
       RemoveDuplicates rs = new RemoveDuplicates();
       rs.removedups(node);
       singlyLinkedList.displayLinkList(node);








    }
}
