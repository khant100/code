package DSACCodingInt.Moderate;

public class NumberSwapper {
    // swap numer without using third variable and String also

    private void swap(int a, int b){
        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println("a="+a+" b="+b);
    }
    private void swapb(int a, int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a="+a+" b="+b);
    }

    public void swapStr(String a1,String a2){
        a1=a1+a2;
        a2=a1.substring(0,a1.length()-a2.length());
        a1=a1.substring(a2.length(),a1.length());
        System.out.println("a1="+a1+" a2="+a2);
    }
    public static void main(String args[]){

        NumberSwapper ns = new NumberSwapper();
        ns.swap(7,5);
        ns.swapStr("khant","vyas");

    }
}
