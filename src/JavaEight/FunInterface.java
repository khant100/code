package JavaEight;

@FunctionalInterface
public interface FunInterface {

    void add(int x);
    default void show(){

    }
    default void show1(){
        System.out.println("vyas");
    }

    static void showme(){

    }
}
