package DSA.medium.ArrayProb;

public class SpiralMatrixRec {


    private static void recurPrint(int[][] input,int row,int column,int i , int j){
        if(i>=row||j>=column){
            return ;
        }
        for(int x =j;x<column;++x){
            System.out.print(" "+input[i][x]);
        }

        for(int x=i+1;x<row;++x){
            System.out.print(" "+input[x][column-1]);
        }
        if(column-1!=i) {
            for (int x = column - 2; x >= j; --x) {
                System.out.print(" " + input[row - 1][x]);
            }
        }
        if(row-1!=j) {
            for (int x = row - 2; x >= i+1; --x) {
                System.out.print(" " + input[x][j]);
            }
        }
        recurPrint(input,row-1,column-1,i+1,j+1);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[][] matrix = new int[5][5];
        int num=10;
        int[][] m=   { { 1, 2, 3, 4 ,5},
                { 6, 7, 8,9,10 },
                { 11, 12,13,14,15 },
                {  16,17,18,19,20 },
                {21,22,23,24,25}};

        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=++num;
            }
        }
        recurPrint(m,m.length,m[0].length,0,0);
    }
}
