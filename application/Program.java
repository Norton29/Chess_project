package application;

import boardGame.Board;
import boardGame.Position;
import chess.ChessMatch;

import java.io.Serializable;
import java.util.HashMap;

public class Program implements Serializable {

    public static void main(String[] args)  {

        ChessMatch chessMatch= new ChessMatch();
        UI.printBoard(chessMatch.getPieces());



    }
}
