package DSA.medium.ArrayProb;

public class SpirlMatrix {

    // 11 12 13 14 15
    // 16 17 18 19 20
    // 21 22 23 24 25
    // 26 27 28 29 30
    // 31 32 33 34 35


    private  void printhorizontal(int[][] input,int si ,int sj,int ei){
        for(int x=si;x<=ei;x++) {
            System.out.print(" " + input[x][sj]);
        }

    }

    private  void printhorizontalrev(int[][] input,int si ,int sj,int ei){
        for(int x=si;x>=ei;--x) {
            System.out.print(" " + input[x][sj]);
        }

    }

    private  void printVertical(int[][] input,int si ,int sj,int ej){
        for(int x=sj;x>=ej;--x) {
            System.out.print(" " + input[si][x]);
        }

    }
    private  void printVerticalrev(int[][] input,int si ,int sj,int ej){
        for(int x=sj;x<=ej;x++) {
            System.out.print(" " + input[si][x]);
        }

    }
    private void printSpiralArray(int[][] input ,int m ,int n){

//    printhorizontal(input,0,3,3);
//    printVertical(input,3,2,0);
//    printhorizontalrev(input,2,0,0);
//    printVerticalrev(input,0,1,2);

    int i=0;

    int j=0;

        while(i<=m&&j<=n){
            printhorizontal(input,i,m,n);
            n--;
            printVertical(input,m,n,j);
            m--;
            printhorizontalrev(input,n,j,i);
            j++;
            printVerticalrev(input,i,j,m);
            i++;


        }


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

       SpirlMatrix main = new SpirlMatrix();
        main.printSpiralArray(m,4,4);



    }
}