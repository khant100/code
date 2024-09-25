package DSACCodingInt.Recursion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Problem:Implement an algorithm to print all valid combinations of n pairs of
 * parentheses.
 *
 */

public class Parenthesis {

    public static List<String> printParenthsis(int n){
        List<String> list = new ArrayList<>();
        char[] str = new char[n*2];
        process(list,0,n,n,str);
        return list;
    }

    private static void process(List<String> list1,int index, int open,int close,char[] str){

        if(open<0||close<open){
            return;
        }
        if(open==0&&close==0){
            list1.add(String.copyValueOf(str));
        }else {


                str[index]='(';
                process(list1, index+1, open -1, close, str);


                str[index]=')';
                process(list1, index+1, open, close -1, str);

        }


    }

    public static void main(String[] args){

        printParenthsis(4).stream().forEach(x->System.out.println(x));
    }

}
