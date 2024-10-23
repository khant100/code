package concept.recursion;


//The n-queens is the problem of placing n queens on n × n chessboard such that no two queens
//        can attack each other. Given an integer n,
//        return all distinct solutions to the n -queens puzzle.
//        Each solution contains a distinct boards configuration of the queen's
//        placement, where ‘Q’ and ‘.’ indicate queen and empty space respectively.//

// every row should have 1 queen every column should have 1 queen and should not attack each other

import java.util.ArrayList;
import java.util.List;

public class NQueenInChess {

    public static List<List<String>> solveNQueens(int n){
        String[][] board = new String[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]=".";
            }
        }
        List<List<String>> res = new ArrayList<>();
        dfs(0,board,res);
        return res;
    }

    public static void dfs(int index,String[][] board,List<List<String>> ans){
        if(index==board[0].length){
            ans.add(list(board));
            return;
        }

        for(int i=0;i<board.length;i++){
            if(validate(i,index,board)){
                board[i][index] ="Q";
                dfs(index+1,board,ans);
                board[i][index]=".";
            }

        }

    }
    public static boolean validate(int row , int col,String[][] board){
        int rowI = row;
        int colI =col ;
        while(row>=0&&col>=0){
            if(board[row][col]=="Q"){
                return false;
            }
            row--;
            col--;
        }
        row =rowI;
        col=colI;
        while (col>=0){
            if(board[row][col]=="Q"){
                return false;
            }
            col--;
        }
        row =rowI;
        col=colI;
        while(col>=0&&row<board.length){
            if(board[row][col]=="Q") {
                return false;
            }
            col--;
            row++;
        }
        return true;
    }
public static List<String> list(String[][] board){
       List<String> list = new ArrayList<>();
        for (int i=0;i<board.length;i++){
            String s = "";
            for(int j=0;j<board[0].length;j++){
                s=s+board[i][j];

            }
            list.add(s);
        }
return list;
    }

    public static void main(String args[]){
        int N = 4;
        List <List< String >> queen = solveNQueens(N);
        int i = 1;
        for (List < String > it: queen) {
            System.out.println("Arrangement " + i);
            for (String s: it) {
                System.out.println(s);
            }
            System.out.println();
            i += 1;
        }

    }



}
