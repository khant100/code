package JavaEight;

@FunctionalInterface
public interface FunctionInterface {
    int operation(int a , int b);
    /// default method to be use

    default void show(){
        System.out.println("this is show");
    }
    // multiple default methods can be used for java 8
    default void show1(){
        System.out.println("this is show");
    }
}
