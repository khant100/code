package DSACCodingInt.Stack;

import java.util.*;

public class SetOfStack {

    List<Stack<Integer>> listofstack= new ArrayList();
    final int capacity = 3;


    public void push(int x ){
        Stack<Integer> s = getLastStack();
        if(s==null||s.size()==capacity){
            Stack<Integer> temp = new Stack<>();
            temp.push(x);
            listofstack.add(temp);
        }else{
            s.push(x);

        }

    }

    public Integer pop(){
        Stack<Integer> s = getLastStack();
        if(s==null){
            return null;
        }else{
            int x=s.pop();
            if(s.isEmpty()){
                listofstack.remove(listofstack.size()-1);
            }
        return x;
        }


    }


    public Stack<Integer> getLastStack(){

        if(listofstack.isEmpty()){
            return null;
        }else{
            return listofstack.get(listofstack.size()-1);
        }



    }

    public static void main(String[] args) throws Exception {
        SetOfStack setOfStack = new SetOfStack();
        int[] given = {2,3,5,7,9,1};
        Arrays.stream(given).forEach(x->setOfStack.push(x));
        setOfStack.listofstack.stream().forEach(x->System.out.println(x));
      System.out.print("->"  +setOfStack.pop());
        System.out.print("->"  +setOfStack.pop());
        System.out.print("->"  +setOfStack.pop());
        System.out.println();
        setOfStack.listofstack.stream().forEach(x->System.out.println(x));



    }


}
