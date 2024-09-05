package InterviewCodeQues.String;

public class SwapStr {

    public static void main(String args[]) {

        String s = "khant";
        String a = "vyas";
        System.out.println("s= "+s+"a= "+a);
        int x = 5;
        int y = 6;
        System.out.println("x= "+x+"y= "+y);
         x = x+y;
         y=x-y;
         x=x-y;

        System.out.println("x= "+x+"y= "+y);
        s=s+a;
        a=s.substring(0,s.length()-a.length());
        s=s.substring(a.length(),s.length());
        System.out.println("s= "+s+"a= "+a);

    }
}
