package concept.BitMinipulation;

public class CovertorAndOperator {

    public static String DesimalToBinary(int giv){
        StringBuilder bin=new StringBuilder();
        while(giv>0){
            if(giv%2==1){
                bin.append("1");
            }else{
                bin.append("0");
            }
            giv=giv/2;
        }
        return  bin.reverse().toString();

    }

    public static int BinaryToDecimal(String giv){
        int sum =0;
        int count=0;
        for(int i=giv.length()-1;i>=0;i--){
            if(giv.charAt(i)=='1'){
                sum+=Math.pow(2,count);
            }
        count++;
        }
        return  sum;

    }


    public static void main(String args[]){

        System.out.println(DesimalToBinary(13));
        System.out.println(BinaryToDecimal("1101"));

        /// and operator
        int i=13&7;
        int j=13|7;
        int k=13^7;
        int a=13<<1;
        int b=13>>1;
        int not=~5;
        int not1=~-6;
        System.out.println("13&7;"+i);
        System.out.println("13|7;"+j);
        System.out.println("13^7;"+k);
        System.out.println("13<<7;"+a);
        System.out.println("13>>7;"+b);
        System.out.println("not;"+not);
        System.out.println("not1;"+not1);

    }
}
