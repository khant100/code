package concept;

public class Recursion {
    // print 1 to N using recursion
    //print N to 1 using recursion
    // print 5 times using recursion

    public int c=0;
    public void print1ToN(int N){
        if(N==0){
            return;
        }
        System.out.print(" "+N);
        print1ToN(N-1);
    }
    public void printNTo1(int N,int c){
        if(c>N){
            return;
        }
        System.out.print(" "+c);

        printNTo1(N,c+1);
    }
    public void printS(int N, int i){
        if(i>N){
            return;
        }
        System.out.print("Khant ");
        printS(N,i+1);
    }
// Non parametrised print
    public void printNTime(){
        if(c==5){
            return;
        }
        System.out.print("-> "+c);
        c=c+1;
        printNTime();
    }



    public static void main(String args[]){
        Recursion rs = new Recursion();
        rs.print1ToN(5);
        System.out.println();
        rs.printNTo1(5,1);
        System.out.println();
        rs.printS(5,1);
        rs.printNTime();


    }
}
