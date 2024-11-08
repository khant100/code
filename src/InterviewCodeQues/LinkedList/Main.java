package InterviewCodeQues.LinkedList;

public class Main
{
    static int length(NodeL head)
    {
        NodeL temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    static void printList(NodeL head)
    {
        NodeL ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }
    static void deletKthFromback(NodeL head, int k){
        NodeL curr = head;
        int count =0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        if(k==count){
            head= head.next;
        }
        NodeL no =head;
        for(int i=1;i<count-k;i++){
            no=no.next;
        }
        no.next=no.next.next;
    }

    public static int findmiddel(NodeL head){


        NodeL slow = head;
        NodeL fast = head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast==null){
            return slow.data;
        }else{
            return slow.data;
        }

    }
    public static void main(String args[]){
        NodeL head = new NodeL(1);
        head.next = new NodeL(2);
        head.next.next = new NodeL(3);
        head.next.next.next = new NodeL(4);
        head.next.next.next.next = new NodeL(5);
        printList(head);
        System.out.println(findmiddel(head));
        deletKthFromback(head,3);
        printList(head);
        System.out.println(findmiddel(head));

    }
}
