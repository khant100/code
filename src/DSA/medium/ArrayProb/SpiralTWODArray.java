package DSA.medium.ArrayProb;

public class SpiralTWODArray {



    private static void spiralPrint(int row, int column,int[][] twoD){
        int i, l=0 ,k=0;

        while(l<row&&k<column){
            for(i=l;i<column;++i){
                System.out.print(" "+twoD[k][i]);
            }
            ++k;
            for(i=k;i<row;++i){
                System.out.print(" "+twoD[i][column-1]);
            }
            column--;
            if(k<row){
                for(i=column-1;i>=l;--i){
                    System.out.print(" "+twoD[row-1][i]);
                }
                row--;
            }
            if(l<column){
                for(i=row-1;i>=k;--i){
                    System.out.print(" "+twoD[i][l]);
                }
                l++;
            }





        }



    }


    public static void main(String[] args)
    {
        int R = 4;
        int C = 4;
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        // Function Call
        spiralPrint(R, C, a);
    }
}
