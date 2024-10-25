package DSACCodingInt.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * Problem: Write an algorithm to print all ways of arranging eight queens on a
 * 8*8 chess board so that none of them share the same row, column, or diagonal.
 * In this case, "diagonal" means all diagonals, not just the two that bisect
 * the board.
 *
 */
public class Queen {
    public List<List<String>> set(int size) {
        String[][] chess = new String[size][size];
        for(int i=0;i<chess.length;i++){
            for (int j=0;j<chess.length;j++){
                chess[i][j]=".";
            }
        }
        List<List<String>> res = new ArrayList<>();
        int[] col = new int[size];
        int[] d1 = new int[2*size-1];
        int[] d2 = new int[2*size-1];
        placeQueens(0, chess, res,col,d1,d2);
        return res;
    }

    public void placeQueens(int row,String[][] chess,List<List<String>> ans,int[] collum,int[] d1, int[] d2) {
        if (row == chess.length) {
            ans.add(temp(chess));
        } else {
            for (int col = 0; col < chess.length; col++) {
                if (collum[col]==0&&d1[row+col]==0&&d2[chess.length-1+row-col]==0) {

                    chess[row][col]="Q";
                    collum[col]=1;
                    d1[row+col]=1;
                    d2[chess.length-1+row-col]=1;
                    placeQueens(row + 1,chess,ans,collum,d1,d2);
                    collum[col]=0;
                    d1[row+col]=0;
                    d2[chess.length-1+row-col]=0;
                    chess[row][col]=".";
                }
            }
        }
    }

    /**
     * Check if (row1, column1) is a valid spot for a queen by checking if there
     * is a queen in the same column or diagonal. We don't need to check it for
     * queens in the same row because the calling placeQueen only attempts to
     * place one queen at a time. We know this row is empty.
     */
    private List<String> temp(String[][] chess) {

        List<String> t = new ArrayList<>();

        for(int i=0;i<chess.length;i++){
            String s ="";
            for (int j=0;j<chess[0].length;j++){
                s=s+chess[i][j];
            }
            t.add(s);
        }
        return t;
    }

    public static void main(String[] args){
        int i=8;
        Queen q = new Queen();
        q.set(i).stream().forEach(x->{System.out.println("Begin-");x.stream().forEach(y->{
            System.out.println(y);});});

    }
}
