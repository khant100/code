package DSA.medium.StringClass;

import java.security.PublicKey;

public class LongestPalindrone {
    private static boolean findPalindrone(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static String palinDrome(String s){

        if(s.length()<=1){
            return s;
        }

        int max =1;
        String maxlen = s.substring(0,1);
        for(int i=0;i<s.length();i++){

            for(int j=max;j<=s.length();j++){

                if(j-i>max&&findPalindrone(s.substring(i,j))){
                    max=j-i;
                    maxlen=s.substring(i,j);
                    System.out.println(": "+maxlen);
                }

            }
        }
        return maxlen;

    }
    public static void main(String[] args) {

        System.out.println(": " +palinDrome("forgeeksskeegfor"));
    }


}
