package DSACCodingInt.Recursion;
 //Problem: Given a boolean expression consisting of the symbols 0 (false),
   //      * 1(true),
public class BooleanEvalution {

public static int count= 0;

    public static boolean booeanTostr(String s){
        return s.equals("1") ? true : false;
    }

    public  static int eval(String s,boolean b){
        count++;
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return booeanTostr(s)==b ? 1:0;
        }
        int ways =0;
        for(int i=1;i<s.length();i=i+2){
            char c = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1,s.length());
            int rightTrue = eval(right,true);
            int rightFalse = eval(right,false);
            int leftTrue = eval(left,true);
            int leftFalse = eval(left,false);
          int total = (leftFalse+leftTrue)* (rightFalse+rightTrue);
            int totalTrue = 0;
            if (c == '^') { // required: one true and one false
                totalTrue = leftTrue * rightFalse + leftFalse * rightTrue;
            } else if (c == '&') { // required: both true
                totalTrue = leftTrue * rightTrue;
            } else if (c == '|') { // required: anything but both false
                totalTrue = leftTrue * rightTrue + leftFalse * rightTrue + leftTrue * rightFalse;
            }
            int subWays = b ? totalTrue : total - totalTrue;
            ways += subWays;

        }
        return ways;

    }
    public static void main(String[] args){
        System.out.println("n :");
    }
}
