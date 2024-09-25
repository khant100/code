package DSACCodingInt.StringClass;


/**
 * Problem: Assume you have a method isSubstring which checks if one word is a
 * substring of another. Given two Strings, check if s2 is a rotation of s1
 * using only one call to isSubstring
 */


public class StringRotationCheck {
    public boolean rotaionCheck(String s1, String s2) {
        if ((s1.length() != s2.length() || s1.length() == 0 || s2.length() == 0)) {
            return false;
        } else {
            String con = s1 + s1;
            if (con.indexOf(s2) >= 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        //{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}
        StringRotationCheck sr = new StringRotationCheck();
        System.out.println(sr.rotaionCheck("abcd", "cdab"));
        System.out.println(sr.rotaionCheck("apple", "pleap"));
        System.out.println(sr.rotaionCheck("camera", "racame"));
        System.out.println(sr.rotaionCheck("waterbottle", "erbottlewa"));

    }
}
