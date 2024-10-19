package InterviewCodeQues.String;


import java.util.Arrays;

//Q:Given an integer n, return a string array answer (1-indexed) where:
//
//        answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//        answer[i] == "Fizz" if i is divisible by 3.
//        answer[i] == "Buzz" if i is divisible by 5.
////        answer[i] == i (as a string) if none of the above conditions are true.
public class StringArr {


    public String[] fiz(int i){
        String[] result=new String[1];
        String s = "fizzbuzz";
        int count = 0;
        if(i%5==0&&i%3==0){
            result[0]=s;
        }
        else if(i%3==0){
            result[0]=s.substring(0,4);
        }else if(i%5==0){
            result[0]=s.substring(4,s.length());
        }else{
            result[0]=String.valueOf(i);
        }
return result;
    }
    public static void main(String args[]) {
        StringArr ss = new StringArr();
        System.out.println(Arrays.toString(ss.fiz(15)));
        System.out.println(Arrays.toString(ss.fiz(9)));
        System.out.println(Arrays.toString(ss.fiz(25)));
        System.out.println(Arrays.toString(ss.fiz(17)));

    }
}
