package DSACCodingInt.Stack;

import java.util.Stack;

public class QueueViaStack<T> {
   private Stack<T> s1 = new Stack<T>();
    private Stack<T> s2 = new Stack<T>();

    public  int size(){
        return s1.size()+s2.size();
    }

    public void push(T data){
        s1.push(data);
    }

    public T remove(){
        if(s1.isEmpty()&&s2.isEmpty()){
            return null;
        }
        if(s2.isEmpty()){
            operation();
        }
      return   s2.pop();
    }

    public T peek(){
        if(size()==0){
            return null;
        }
        if(s2.isEmpty()){
            operation();
        }
      return s2.peek();
    }

    private void operation(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
    }




}
