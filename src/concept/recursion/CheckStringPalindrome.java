package concept.recursion;

public class CheckStringPalindrome {

 public boolean checkPanlindrone(String given,int i,int j ){
     // this is function which returns functions
     if(i>=j){
        return true;
     }
         if (given.charAt(i) != given.charAt(j)) {
             return false;
         }
      return checkPanlindrone(given, i + 1, j - 1);

 }


    public static void main(String args[]){
    CheckStringPalindrome chk = new CheckStringPalindrome();
    String given= "madam";
     System.out.println(given+"- : "+chk.checkPanlindrone(given,0,given.length()-1));
    }

}
