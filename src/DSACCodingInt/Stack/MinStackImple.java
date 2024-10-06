package DSACCodingInt.Stack;

public class MinStackImple {



    public static void main(String args[]) throws Exception {
        ImplementMinStack implementMinStack = new ImplementMinStack();
        implementMinStack.push(0);
        implementMinStack.push(9);
        implementMinStack.push(1);
        implementMinStack.push(-1);
        implementMinStack.push(3);
        implementMinStack.push(5);
        System.out.println(" "+implementMinStack.min());
       System.out.println( implementMinStack.pop());
        System.out.println(" "+implementMinStack.min());
        System.out.println( implementMinStack.pop());
        System.out.println(" "+implementMinStack.min());
        System.out.println( implementMinStack.pop());
        System.out.println(" "+implementMinStack.min());
        StackAndMin stackAndMin = new StackAndMin();
        stackAndMin.push(0);
        stackAndMin.push(9);
        stackAndMin.push(1);
        stackAndMin.push(-1);
        stackAndMin.push(3);
        stackAndMin.push(5);
        System.out.println(" "+stackAndMin.min());
        System.out.println( stackAndMin.pop());
        System.out.println(" "+stackAndMin.min());
        System.out.println(" "+stackAndMin.pop());
        System.out.println( " "+stackAndMin.pop());
        System.out.println(" "+stackAndMin.min());




    }
}
