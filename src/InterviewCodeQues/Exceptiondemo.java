package InterviewCodeQues;

public class Exceptiondemo {

    public static void main(String args[]) {
        try{
            System.out.println("try");
            int a=5/0;
        }catch (ArithmeticException e){
            System.out.println("catch");
            return;

        }finally{
            System.out.println("finally");
        }
    }
}
