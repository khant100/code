package DSA.medium.Maths;

// create atoit function where it ignore white space when carector it will return

public class Atiot {


   private int atoit(String s){
       long output = 0;
       int i = 0;
       int pos = 1;
       while(i<s.length()&&s.charAt(i)==' '){
           i++;
       }

       if(i<s.length()&&(s.charAt(i)=='-'||s.charAt(i)=='+')) {
           if (s.charAt(i) == '-') {
               pos = -1;
           }
       i++;
       }

       while (i < s.length()&&(s.charAt(i)-'0'<=9&&s.charAt(i)-'0'>=0)) {
            int dig = s.charAt(i)-'0';

//            if(output>Integer.MAX_VALUE/10||(output==Integer.MAX_VALUE && dig > Integer.MAX_VALUE%10)) {
//            return pos==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
//            }

            output=output*10+dig;
            i++;


       }
if(output>Integer.MAX_VALUE){
    return (pos==1) ? Integer.MAX_VALUE :Integer.MIN_VALUE;
}

       return (int) output*pos;

   }





    public static void main(String args[]){
Atiot atiot = new Atiot();

 String s ="    uu+42";
        System.out.println("  "+atiot.atoit(s));


    }


}
