package DSACCodingInt.StringClass;

public class StringCompression {

//    private static String StringBufferCompress(String given){
//        StringBuffer sf = new StringBuffer();
//        int cinCount =1;
//        for(int i=0;i<given.length();i++){
//            if(i+1>=given.length()||(given.charAt(i)!=given.charAt(i+1))){
//                sf.append(given.charAt(i-1));
//                sf.append(String.valueOf(cinCount));
//                cinCount=1;
//            }else{
//                cinCount++;
//            }
//            sf.append(given.charAt(given.length()-1));
//            sf.append(cinCount);
//        }
//    return sf.toString();
//    }
  private String compressString(String given){
   StringBuilder sb = new StringBuilder();
   int consituveChar=0;
   for(int i=0;i<given.length();i++){
       consituveChar++;
       if(i+1>=given.length()||(given.charAt(i)!=given.charAt(i+1))){
           sb.append(given.charAt(i));
           sb.append(consituveChar);
           consituveChar=1;
       }

   }
      return given.length()>sb.toString().length()?sb.toString():given;

  }

    public static void main(String[] args) {
      StringCompression stringCompression = new StringCompression();
      System.out.println(stringCompression.compressString("aaaaabbbbaaaabbddc"));
       // System.out.println(StringBufferCompress("aaaaabbbbaaaabbddc"));

    }
}
