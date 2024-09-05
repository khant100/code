package DSA.medium.StringClass;

public class LongestStringWithRepeting {
 private static int suLength(String s){
     int maxlength = 0;
     String sub = "";
     if(s.length()==0){
         return 0;
     }
     if(s.length()==1){
         return 1;
     }
     for(char c :s.toCharArray()){
         String current = String.valueOf(c);
         if(sub.contains(current)){
             sub = sub.substring(sub.indexOf(current)+1);
         }

         sub= sub+current;
         maxlength=Math.max(sub.length(),maxlength);
     }
     return maxlength;
 }

    public static void main(String[] args){

        System.out.println(": "+suLength("abcabcab"));
        System.out.println(": "+suLength("bbb"));
        System.out.println(": "+suLength("pkwepwka"));



    }
}
