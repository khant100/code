package DSACCodingInt.LinkedList;

import java.util.Stack;

public class PalinDromeList {

    private boolean checkPalindrome(SinglyLinkedList.Node head){
        SinglyLinkedList.Node fast = head;
        SinglyLinkedList.Node slow = head;

        Stack<SinglyLinkedList.Node> st = new Stack<>();
        while(fast!=null&&fast.next!=null){
            st.add(slow);
            slow=slow.next;

            fast=fast.next.next;
        }
        if(fast!=null){
            slow=slow.next;
        }


        while(slow!=null){
            if(st.pop().data!=slow.data){
                return false;
            }
            slow=slow.next;
        }
        return true;

    }



    public static void main(String args[]){

        PalinDromeList p = new PalinDromeList();
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        SinglyLinkedList.Node head = singlyLinkedList.getLinkList(new int[]{2,5,7,8,7,5,2,4});
        singlyLinkedList.displayLinkList(head);
        System.out.println(p.checkPalindrome(head));
        SinglyLinkedList.Node head1 = singlyLinkedList.getLinkList(new int[]{2,5,7,7,5,2,2});
        singlyLinkedList.displayLinkList(head1);
        System.out.println( p.checkPalindrome(head1));




    }
}
