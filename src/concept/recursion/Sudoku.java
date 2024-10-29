package concept.recursion;

public class Sudoku {



    public Boolean solveSudoku(char[][] board){

        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){

                if(board[row][col]=='.'){

                    for(char c='1';c<='9';c++){
                        if(isValid(board,row,col,c)){
                            board[row][col]=c;
                            if(solveSudoku(board)){
                                return true;
                            }else{
                                board[row][col]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }


    public boolean isValid(char[][] board,int row,int col,char c){
        for(int i=0;i<9;i++){
            if(board[row][i]==c){
                return false;
            }
            if(board[i][col]==c){
                return false;
            }
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==c){
                return false;
            }
        }
return true;

    }

public static void main(String args[]){
        char[][] board = {{'9', '5', '7', '.', '1', '3', '.', '8', '4'},
                {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
                {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
                {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
                {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
                {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
                {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
                {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
                {'7', '.', '6', '1', '8', '5', '4', '.', '9'}};
    for (int i=0;i<9;i++){
        for (int j=0;j<9;j++){
            System.out.print(board[i][j]+" |");
        }
        System.out.println();
        System.out.println("---------------------");
    }
        Sudoku su = new Sudoku();
        su.solveSudoku(board);
    System.out.println();
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){

                System.out.print(board[i][j]+" |");
            }
            System.out.println();
        System.out.println("---------------------");
        }
}

}
