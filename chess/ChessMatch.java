package chess;

import java.util.stream.IntStream;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;

	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		IntStream.range(0, board.getRows())
		.forEach(i -> IntStream.range(0, board.getColumns())
				.forEach(j -> mat[i][j] = (ChessPiece) board.piece(i, j)));
		
		return mat;
		
	}
	
	private void placeNewPiece(char column, int row, ChessPiece chessPiece) {
		board.placePiece(chessPiece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('a', 8 ,new Rook(board, Color.BLACK));
		placeNewPiece('h', 8 ,new Rook(board, Color.BLACK));
		placeNewPiece('a', 1, new Rook(board, Color.WHITE));
		placeNewPiece('h', 1, new Rook(board, Color.WHITE));
		placeNewPiece('d', 7, new King(board, Color.BLACK));
		placeNewPiece('d', 1 , new King(board, Color.WHITE));
	}
}
