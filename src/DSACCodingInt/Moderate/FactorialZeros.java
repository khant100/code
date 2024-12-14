package DSACCodingInt.Moderate;

public class FactorialZeros {
    public static int fact(int sum){
        if(sum<3){
            return sum;
        }
        return sum * fact(sum-1);
    }

    private static int findfac(int sum){
        int count =0;
        for(int i=2;i<=sum;i++){
            count+=fact5(i);
        }
    return count;
    }

    private static int countZero(int sum){
        int count =0;
        for(int i=5;sum/i>0;i=i*5){
            count+=sum/i;
        }
        return count;
    }
    private static int fact5(int i){
        int count =0;
        while(i%5==0){
            count++;
            i=i/5;
        }
        return count;
    }

    public static void main(String args[]){

        for (int i = 2; i < 12; i++) {
            System.out.println(i + "! (or " + fact(i) + ") has " + findfac(i) + " zeros");
            System.out.println(i + "! (or " + fact(i) + ") has " + countZero(i) + " zeros");
        }

    }


}
