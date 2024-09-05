package DSACCodingInt.BitManipulation;

public class ConversionBit {

    //11101
    //01111
    //10010 18
    //01001 9 after right shift

    static int count(int a,int b){
        int count =0;
        int res = a^b;
        System.out.println("a^b "+(a^b));
        System.out.println("res "+res);
        while(res!=0){
            System.out.println("res "+res);
            count = count +(res & 1);
            // this means AND operation at bit level
            System.out.println("res "+res);
            res >>>=1;
            // this means shifting bit to right

            System.out.println("res "+res);
        }
return  count;

    }

    public static void main(String[] args) {
        System.out.println(" "+count(29,15));
    }
}
