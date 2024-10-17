package concept.recursion;

public class Fibonacci {

public int fibonacci(int n){
    if(n<=1){
        return n;
    }

return fibonacci(n-1)+fibonacci(n-2);
}

// having multiple recursu=ion calls
    // time complexity is 2 to power N expontential
    public static void main(String args[]) {
    Fibonacci f = new Fibonacci();
    int n =5;
    System.out.println("Fibonacci "+n+ " : is "+f.fibonacci(n));

}
}
