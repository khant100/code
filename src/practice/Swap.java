package practice;

public class Swap {
    public static void main(String args[]){
        int a =7;
        int b = 10;
        System.out.println("a="+a+" b="+b);
         a=a+b;
         b=a-b;//a+b-b = a
        a=a-b;
        System.out.println("a="+a+" b="+b);
    }
}
