package concept.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubSequence{
    // print contigious sub sequence
    //{3,1,2} 3 , 1 ,2 {3,1} {1,2} {3,2} {3,1,2} all are subsequence
    //{3,1,2} 3 , 1 ,2 {3,1} {1,2} {3,2} this is subArray
    // time complexity will be (2 pow n *N)
    // space complexity will be (o(n))


    public void subsequence(int[] given, int index, List<Integer> path){
        if(index==given.length){
            if(path.size()>0) {
                System.out.println(path);
            }
        }else {

            subsequence(given,index+1,path);
            path.add(given[index]);
            subsequence(given,index+1,path);
            path.remove(path.size()-1);




        }
        return;
    }

    public static void main(String args[]) {
        PrintSubSequence prt = new PrintSubSequence();
        int[] arr = {3,1,2};
        List<Integer> path = new ArrayList<>();
        prt.subsequence(arr,0,path);
       // path.stream().forEach(x->System.out.println(x));

    }

}




