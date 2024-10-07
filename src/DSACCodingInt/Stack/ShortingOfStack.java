package DSACCodingInt.Stack;

import java.util.Stack;

public class ShortingOfStack {


    public Stack<Integer> sortStack(Stack<Integer> given){
        System.out.println(given);
        Stack<Integer> side = new Stack<>();
        while(!given.isEmpty()){

            Integer top = given.pop();
            while(!side.isEmpty()&&top<side.peek()){
                given.push(side.pop());
            }
            side.push(top);
            System.out.println(given);
            System.out.println(side);
        }
        System.out.println(given);
        System.out.println(side);

return side;

    }

public static void main(String args[]){
        ShortingOfStack sc = new ShortingOfStack();
        Stack<Integer> s = new Stack<>();
        s.push(9);
        s.push(1);
        s.push(8);
        s.push(5);
        s.push(7);
        s.push(3);
      System.out.println(  sc.sortStack(s));
}

}
