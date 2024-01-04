package application;

import java.util.stream.IntStream;

import chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] pieces) {
		IntStream.range(0, pieces.length)
		.forEach(i -> {
			System.out.print((8-i)+ " ");
			IntStream.range(0, pieces.length)
			.forEach(j -> printPiece(pieces[i][j]));
			System.out.println();
		});
		System.out.println("  a b c d e f g h");
		
	}
	
	public static void printPiece(ChessPiece piece) {
		if(piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
