package InterviewCodeQues;

public class RomanToInteger {


    public String intergerToRoman(int n ){
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<values.length;i++){

            while(n>=values[i]) {
            n-=values[i];
            sb.append(romanLetters[i]);
            }
        }


return sb.toString();

    }


public static void main(String args[]){
        RomanToInteger r = new RomanToInteger();
       System.out.println( r.intergerToRoman(125));
    System.out.println( r.intergerToRoman(252));
    System.out.println( r.intergerToRoman(1000));
    System.out.println( r.intergerToRoman(1010));

}
}
