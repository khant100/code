package LeetcodeRevist.Medium.string;

public class ReverseWordInStrings {

    public String ReverseWords(String s){
        String giv = s.trim();
        String[] sen = giv.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=sen.length-1;i>=0;i--){

            if(sen[i].length()>0){
                sb.append(sen[i].trim());
                sb.append(" ");
            }
        }

      return  sb.toString().trim();
    }




    public static void main(String args[]){
    ReverseWordInStrings rs = new ReverseWordInStrings();
        System.out.println("the sky is blue->"+rs.ReverseWords("the sky is blue"));
        System.out.println("a good   example->"+rs.ReverseWords("a good   example"));
        System.out.println("  hello world  ->"+rs.ReverseWords("  hello world  "));

    }
}
