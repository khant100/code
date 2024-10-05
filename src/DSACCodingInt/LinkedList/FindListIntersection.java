package DSACCodingInt.LinkedList;

import DesignPattern.NullDesignPattern.NullVehicle;

public class FindListIntersection {

    private Integer findListIntersection(SinglyLinkedList.Node l1, SinglyLinkedList.Node l2){
        if(l1==null||l2==null){
            return null;
        }
        SinglyLinkedList.Node n = l1;
        SinglyLinkedList.Node m = l2;

        while(m!=n){

           n= (n==null) ? l2 :n.next;
           m=(m==null)?l1:m.next;
        }
        return n==null?null:n.data;
    }

    private SinglyLinkedList.Node tail(SinglyLinkedList.Node head){
        SinglyLinkedList.Node a = head;
        while(a.next!=null){
            a=a.next;
        }
    return a;
    }
    public static void main(String args[]) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        FindListIntersection f = new FindListIntersection();
        SinglyLinkedList.Node a = singlyLinkedList.getLinkList(new int[]{2,5,6,1});
        SinglyLinkedList.Node b = singlyLinkedList.getLinkList(new int[]{3,7,8});
        SinglyLinkedList.Node c = singlyLinkedList.getLinkList(new int[]{33,66});
        SinglyLinkedList.Node cur = a;
        SinglyLinkedList.Node cur1 = b;
        f.tail(a).next=c;
        f.tail(b).next=c;

        singlyLinkedList.displayLinkList(a);
        singlyLinkedList.displayLinkList(b);
        SinglyLinkedList.Node x = singlyLinkedList.getLinkList(new int[]{20,90,80,60});
        SinglyLinkedList.Node y = singlyLinkedList.getLinkList(new int[]{0,901,30,77});
        singlyLinkedList.displayLinkList(x);
        singlyLinkedList.displayLinkList(y);
        System.out.println("Intersection is : "+f.findListIntersection(x,y));




    }

}
