package DSACCodingInt.Recursion;

public class CoinChange {

    public int makeChange1(int n) {
        int[] denoms = { 25, 10, 5, 1 };
        return helper1(n, denoms, 0);
    }
    public int helper1(int amount, int[] denoms, int index) {
        if (index >= denoms.length - 1) {
            // last denom
            return 1;
        }
        int denomAmount = denoms[index];
        int res = 0;
        for (int i = 0; i * denomAmount <= amount; i++) {
            int amountRemaining = amount - i * denomAmount;
            res += helper1(amountRemaining, denoms, index + 1);
        }
        return res;
    }

    public static void main(String[] args){
CoinChange c = new CoinChange();
    System.out.println("n :"+c.makeChange1(25
    ));
    }
}
//25 , 5*5, 1*25 , 10*2+5*1 , 1*10 +10*1+5*1