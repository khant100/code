package JavaConcept.Multithreading;

public class ThreadLocal1 {

    public static void main(String args[]){

        ThreadLocal<String> t1 = new ThreadLocal<String>(){
            protected String initialValue(){
                return "Java intital value";
            }
        };

        System.out.println(t1.get());
        t1.set("valyue is changed");
        System.out.println(t1.get());

    }
}
