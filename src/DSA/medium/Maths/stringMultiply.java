package DSA.medium.Maths;

import java.math.BigInteger;

public class stringMultiply {
    public String multiplyNoBig(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();

        int[] n3 = new int[n1+n2];
        for(int i=n2-1;i>=0;i--){
            for(int j=n1-1;j>=0;j--){
                int p1=j+i;
                int p2=j+i+1;
                int mul = (num1.charAt(j)-'0')*(num2.charAt(i)-'0');
                int sum=mul+n3[p2];
                n3[p1] =n3[p1]+sum/10;
                n3[p2]=sum%10;
                System.out.println(p1+" P1: "+n3[p1]);
                System.out.println(p2+" P2: "+n3[p2]);
            }

        }
        StringBuilder sb = new StringBuilder();

        for(int i : n3){
            if(!(sb.length()==0&&i==0)){
                sb.append(i);
            }

        }


        return sb.length()==0 ? "0" : sb.toString();

    }
    public static void main(String args[]){
        stringMultiply stringMultiply = new stringMultiply();


        System.out.println("  "+stringMultiply.multiply("223","333"));
        System.out.println("  "+stringMultiply.multiplyNoBig("223","333"));


    }

    public String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger  n3 = n1.multiply(n2);

        return  n3.toString();

    }

}
