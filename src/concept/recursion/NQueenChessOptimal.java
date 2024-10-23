package concept.recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueenChessOptimal {
    public static List<String>makelist(String[][] giv){
       List<String> temp = new ArrayList<>();
        for(int i=0;i<giv.length;i++){
            String s="";
            for(int j=0;j<giv[0].length;j++){
               s+=giv[i][j];
            }
        temp.add(s);
        }
    return temp;
    }


    public  static void dfs(int col,String[][] chess,int[] roww,int[] upper,int[] lower,List<List<String>> res){
        if(col==chess.length){
            res.add(makelist(chess));
            return;
        }

        for(int row =0;row<chess.length;row++){
            if(roww[row]==0&&lower[row+col]==0&&upper[chess.length-1+col-row]==0){
                roww[row]=1;
                lower[row+col]=1;
                upper[chess.length-1+col-row]=1;
                chess[row][col]="Q";
                dfs(col+1,chess,roww,upper,lower,res);
                chess[row][col]=".";
                roww[row]=0;
                lower[row+col]=0;
                upper[chess.length-1+col-row]=0;
            }
        }
    }
    public static List<List<String>> nQueen(int N){
        String[][] chess = new String[N][N];
        for (int row =0;row<N;row++){
            for(int col=0;col<N;col++){
                chess[row][col]=".";
            }
        }
        List<List<String>> result = new ArrayList<>();
        int[] rowCh = new int[N];
        int[] upperCross = new int[2*N-1];
        int[] lowerCross = new int[2*N-1];

        dfs(0,chess,rowCh,upperCross,lowerCross,result);
return result;
    }


    public static void main(String args[]){

        nQueen(4).stream().forEach(x->{System.out.println("Begin-");x.stream().forEach(y->{
            System.out.println(y);});});

    }
}
