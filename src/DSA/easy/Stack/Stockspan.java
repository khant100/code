package DSA.easy.Stack;


import java.util.Stack;

class pair1{
    int price;
    int span;

    public pair1(int e , int c){
        price=e;
        span=c;
    }


}


public class Stockspan {

    Stack<pair1> s;
    public Stockspan() {
        s = new Stack<>();

    }

    public int next(int price) {
        int span =1;
        while(!s.isEmpty() && s.peek().price<=price){

            span = span+s.peek().span;
            s.pop();
        }
        s.push(new pair1(price,span));
        System.out.println(s.peek().price+" ----"+s.peek().span);
        return span;
    }

    public static void main(String args[]){
        Stockspan stockspan = new Stockspan();


        int[] nums2 = {100,80,60,70,60,75,85,90};

        for(int i=0;i<nums2.length;i++){
            //System.out.print(" "
                  //  +
                            stockspan.next(nums2[i]);
        //);
        }

    }

}
