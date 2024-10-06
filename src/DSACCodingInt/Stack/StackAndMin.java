package DSACCodingInt.Stack;

import java.util.Stack;

public class StackAndMin extends Stack<Integer> {

    Stack<Integer> min;
    public StackAndMin() {
        min = new Stack<>();
    }

    public void push(int x){
        if(min.isEmpty()||x<=min.peek()){
            min.push(x);
        }
        super.push(x);
    }

    public Integer pop(){
        int x = super.pop();
        if (x==min.peek()){
            min.pop();
        }
        return x;
    }
    public int min() throws Exception{
        if(min.isEmpty()){
            throw new Exception("stack underflow");
        }
    return min.peek();
    }

}
