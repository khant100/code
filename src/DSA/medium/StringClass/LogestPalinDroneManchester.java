package DSA.medium.StringClass;

public class LogestPalinDroneManchester {

    private static String mancherster(String s){

        StringBuilder sb = new StringBuilder();
        sb.append("^#");
        for( char c: s.toCharArray()){
            sb.append(c).append("#");
        }
        sb.append("$");

        String T= sb.toString();
        System.out.println(" T: "+T);
        int n = T.length();
        int[] P = new int[n];
                int R=0, C=0;
        for (int i = 1; i < n-1; i++) {
            P[i] = (R > i) ? Math.min(R - i, P[2*C - i]) : 0;
            System.out.println(" P: "+P[i]);
            while (T.charAt(i + 1 + P[i]) == T.charAt(i - 1 - P[i]))
                P[i]++;

            if (i + P[i] > R) {
                C = i;
                System.out.println(" C: "+C);
                R = i + P[i];
                System.out.println(" R: "+R);
            }
        }

        int max_len = 0, center_index = 0;
        for (int i = 0; i < n; i++) {
            if (P[i] > max_len) {
                max_len = P[i];
                System.out.println(" max_len: "+max_len);
                center_index = i;
                System.out.println(" center_index: "+center_index);
            }
        }
        return s.substring((center_index - max_len) / 2, (center_index + max_len) / 2);


    }
    public static void main(String[] args) {

        System.out.println(": " +mancherster("babad"));
    }
}
