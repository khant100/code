package DesignPattern.LLDTikTakToe;

import java.util.Deque;
import java.util.LinkedList;

public class tiktaktegame {
    Deque<Player> players;
    Board game;

    public void initilizegame(){
    players = new LinkedList<>();
    PlayingPieceX playingPieceX = new PlayingPieceX(PieceType.X);
    Player player1 = new Player("player1",playingPieceX);
        PlayingPieceO playingPieceO = new PlayingPieceO(PieceType.O);
    Player player2 = new Player("player2",playingPieceO);
    players.add(player1);
    players.add(player2);
    game = new Board(3);
    }



}
