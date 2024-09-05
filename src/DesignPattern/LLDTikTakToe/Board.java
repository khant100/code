package DesignPattern.LLDTikTakToe;

public class Board {
    int size;

    public Board(int size, PlayingPiece[][] board) {
        this.size = size;
        this.board = board;
    }

    public Board(int size) {
        this.size = size;
    }
    public PlayingPiece[][] board;

    public boolean addPiece(int row , int column, PlayingPiece playingPiece){
     if(board[row][column]!=null){
         return false;
     }
     board[row][column]=playingPiece;
        return true;
    }

}
