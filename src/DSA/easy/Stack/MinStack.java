package DSA.easy.Stack;


import java.util.Stack;


// Implement mean heap to add minimum elemet to top of list
class pair{
    int val;
    int min;
    pair(int val,int min){
        this.val=val;
        this.min=min;
    }

}

class MinStack {

    Stack<pair> minstack;

    public MinStack() {
        minstack = new Stack<>();
    }

    public void push(int val) {
        if(minstack.size()==0){
            minstack.push(new pair(val,val));
        }else{
            int min = Math.min(minstack.peek().min,val);
            minstack.push(new pair(val,min));
        }

    }

    public void pop() {
        minstack.pop();
    }

    public int top() {
        pair p = minstack.peek();
        return p.val;
    }

    public int getMin() {
        pair p = minstack.peek();
        return p.min;

    }
}


