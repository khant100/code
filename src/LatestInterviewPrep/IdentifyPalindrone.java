package LatestInterviewPrep;

public class IdentifyPalindrone {

    public static boolean isPalindron(String s){
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
    public static void main(String[] args) {

        String s= "A man , a plan , a canal: Panama";
        System.out.println(s+" palindrone check : "+isPalindron(s.replaceAll("[^A-Za-z0-9]","").toLowerCase()));

    }
}
