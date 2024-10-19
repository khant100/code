package InterviewCodeQues.String;


//aaabbbaa string he want print like a3b3a2 like output
public class letterCountsequence {


    private String encode(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        int count=1;
        for(int i=1;i<s.length();i++){

            if(s.charAt(i)!=s.charAt(i-1)){
                sb.append(count);
                sb.append(s.charAt(i));
                count=0;
            }
            count++;
        }
        sb.append(count);
    return sb.toString();
    }
    public static void main(String args[]){
        letterCountsequence lc = new letterCountsequence();
        System.out.println(lc.encode("aaabbbaa"));

    }


}
