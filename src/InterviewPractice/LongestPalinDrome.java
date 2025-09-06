package InterviewPractice;

public class LongestPalinDrome {

    public static int palindromecenter(String s,int i,int j){
        return 0;
    }
    public static int painDroneLength(String s,int i,int j){
        while(i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }
    public static void main(String args[]){


        String p = "forgeeksskeegfor";
        int max = 1;
        for(int i=1;i<p.length();i++){
             max = Math.max(max, painDroneLength(p,i,i));
            max = Math.max(max, painDroneLength(p,i,i+1));
        }
System.out.println("max is "+max);

    }
}
