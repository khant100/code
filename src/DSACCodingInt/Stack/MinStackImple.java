package DSACCodingInt.Stack;

public class MinStackImple {



    public static void main(String args[]){
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



    }
}
