package DSACCodingInt.StringClass;

import java.util.Arrays;

public class PermuationOfString {

    private String str(String s){
        char[] ch =  s.toCharArray();
        Arrays.sort(ch);
        return  new String(ch);
    }

    private boolean checkPermutation(String s1 , String s2){
        return str(s1).equals(str(s2));
    }
    public static void main(String[] args) {
       // {"carrot", "tarroc"}, {"hello", "llloh"}
        PermuationOfString permuation = new PermuationOfString();
        System.out.println("carrot and tarroc "+permuation.checkPermutation("carrot","tarroc"));
        System.out.println("llloh and hello "+permuation.checkPermutation("llloh","hello"));
    }
}
