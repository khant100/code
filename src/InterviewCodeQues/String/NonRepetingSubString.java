package InterviewCodeQues.String;

public class NonRepetingSubString {


public  int longSubString(String s){
    int left=0;
    int right=0;
    int max =0;
    if(s.length()<=1){
        return s.length();
    }
    while(right<s.length()){

        char c = s.charAt(right);
        //System.out.println(s.substring(left,right).contains(String.valueOf(c)));
        if(s.substring(left,right).contains(String.valueOf(c))){
            while(s.substring(left,right).contains(String.valueOf(c))){
                left++;
            }
        }
        right++;
        max = Math.max(max,right-left);

    }
    return max;
}

    public static void main(String[] args) {
        NonRepetingSubString n = new NonRepetingSubString();
        System.out.println(n.longSubString("abcabcab"));
        System.out.println(n.longSubString("bbb"));
        System.out.println(n.longSubString("pkwepwka"));
    }
}
