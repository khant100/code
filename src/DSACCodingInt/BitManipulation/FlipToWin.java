package DSACCodingInt.BitManipulation;

public class FlipToWin {

    private  int longestSequence(int i){
        if(i==-1){
            return Integer.BYTES;
        }
        int current =0;
        int previous =0;
        int max=1;
        System.out.println("Initial :"+Integer.toBinaryString(i));
        while(i!=0){

            if((i&1)==1){
                current++;
            } else if ((i&1)==0) {
                previous =(i&2)==0 ? 0:current;
                current=0;
            }
            System.out.println("Privious"+previous);
            System.out.println("Current"+current);

            max = Math.max(previous+1+current,max);
            i>>>=1;
            System.out.println(i+" : ToBinary :"+Integer.toBinaryString(i));
        }


        return max;
    }

    public static void main(String[] args) {
        FlipToWin f = new FlipToWin();
       // System.out.println(f.longestSequence1(1775));
        System.out.println(f.longestSequence(1775));
        System.out.println(" "+Integer.BYTES);
    }
}
