package DSACCodingInt.Stack;

import DSACCodingInt.Node;

public class QueueToStackTest {
    public static void main(String args[]){
        QueueViaStack q = new QueueViaStack();

        System.out.println("Size of queue "+q.size());
        q.push("rain");
        q.push(24);
        q.push(new Node(2));
        q.push("knant");
        System.out.println("Size of queue "+q.size());
        System.out.println("pop in queue "+q.remove());
        q.push("baby");
        System.out.println("pop in queue "+q.remove());
        System.out.println("Size of queue "+q.size());
        System.out.println("element of queue "+q.peek());
        System.out.println("pop in queue "+q.remove());
        System.out.println("pop in queue "+q.remove());
        System.out.println("pop in queue "+q.remove());

    }
}
