package InterviewPractice;

public class child extends Parent{
    public void m1() {

        System.out.println("Child M1");
    }
    void m2(){
        System.out.println("Child M2");
    }
    public static void main(String[] args) {

        Parent obj = new child();
        obj.m1();
    }
}