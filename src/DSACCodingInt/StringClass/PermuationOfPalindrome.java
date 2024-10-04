package DSACCodingInt.StringClass;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class PermuationOfPalindrome {

private boolean palindromeOfStr(String s1){
  return   s1.toLowerCase().chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x,Collectors.counting())).entrySet()
            .stream().filter(x->x.getValue()%2==1).collect(Collectors.toList()).size()<=1;
}

private boolean optimizeMethod(String s1){
    int[] al = new int[26];
    int count=0;
    for(Character c: s1.toLowerCase().toCharArray()){
        if (c != ' ') {
            al[c-97]++;
        }

    }
    for(int i=0;i<al.length;i++){
        System.out.print(" "+al[i]);
        if(al[i]%2==1){
            count++;
        }
        if(count>1){
            return false;
        }
    }
    return true;

}
    public static void main(String[] args) {
        String s2 = "Zeuswa sdei fdied sawSuez";
        String s1 = "Ra tzsl iveon noevilstarz";
        PermuationOfPalindrome p = new PermuationOfPalindrome();

        s1.toCharArray();
        int[] alpha = new int[26];
        System.out.println('z'-97);

        System.out.println(""+p.palindromeOfStr(s2));
        System.out.println(""+p.palindromeOfStr(s1));
        System.out.println(""+p.optimizeMethod(s1));
        System.out.println(""+p.optimizeMethod(s2));

    }
}
