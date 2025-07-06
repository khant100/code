package JavaEight;

public class FunctionalInterfaceMain {
    public static void main(String[] args) {

        FunctionInterface mul = (a,b)-> a*b;
        FunctionInterface add = (a,b)-> a+b;

        System.out.println("multiply ="+mul.operation(2,6));
        System.out.println("multiply ="+add.operation(2,6));
    }

}
