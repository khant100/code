package DSACCodingInt.Stack;

import java.util.Stack;

public class ImplementMinStack {


    Stack<Integer> sc = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public void push(int x){
        sc.push(x);
        if(min.isEmpty()||x<min.peek()){
            min.push(x);
        }
    }

    public Integer pop(){
        if(sc.isEmpty()){
            return null;
        }

        int x = sc.pop();
        if(x==min.peek()){
            min.pop();
        }
    return x;
    }

    public Integer min(){
       if(min.isEmpty()){
           return null;
       }else{

           return min.peek();
       }

    }


}
