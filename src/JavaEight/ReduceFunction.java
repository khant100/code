package JavaEight;

import java.util.List;

public class ReduceFunction
{

    // use of reduce function
public static void main(String[] args){
    List<String> l1 = List.of("apple","banana","cherry");
    List<Integer> l2 = List.of(1,3,4);
    int res = l2.stream().reduce(0,(a,b)->a+b);
    System.out.println("ans-> "+l1.stream().reduce("-",(a,b)->a+b));
    System.out.println("ans-> "+res);
}

}
