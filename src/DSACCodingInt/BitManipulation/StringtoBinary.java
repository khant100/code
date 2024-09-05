package DSACCodingInt.BitManipulation;

public class StringtoBinary {

     static String sTobinary(Double d){
         if(d>=1||d<0){
             return "Error";
         }
         StringBuilder sb = new StringBuilder();
         sb.append(".");
         while(d>0){
             if(sb.length()>32){
                 return "Error";
             }
             double update = d*2;
             if(update>1){
                 sb.append("1");
                 update=d-1;
             }else{
                 sb.append("0");
                 update=d;
             }

         }
   return sb.toString();
     }

    public static void main(String[] args) {
        System.out.println(" "+sTobinary(0.72));
    }
}
