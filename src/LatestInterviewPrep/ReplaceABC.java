package LatestInterviewPrep;

public class ReplaceABC {

    // replace abc by
    public static void main(String[] args) {
        String s ="I am working in ABC and dABf is a good company";
        String key = new String(new char[]{(char)('A'),(char)('B'),(char)('C')});
        String result = s.replaceAll("(?i)"+java.util.regex.Pattern.quote(key),"wipro");

        System.out.println(result);
    }
}
