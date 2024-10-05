package DSACCodingInt.StringClass;

public class IsUniqueChar {

    private boolean isUniqueCharset(String s){
        boolean[] arr = new boolean[128];

        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(arr[c-0]){
                return false;
            }else {
                arr[c-0]=true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abcdfABCD%@#*";
        IsUniqueChar is = new IsUniqueChar();
        System.out.print(" "+is.isUniqueCharset(s));

    }
}
