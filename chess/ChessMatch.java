package chess;

import java.util.Arrays;
import java.util.stream.IntStream;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;

	public ChessMatch() {
		board = new Board(8,8);
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		IntStream.range(0, board.getRows())
		.forEach(i -> IntStream.range(0, board.getColumns())
				.forEach(j -> mat[i][j] = (ChessPiece) board.piece(i, j)));
		
		return mat;
		
	}
	
	

}
