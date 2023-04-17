package applications;

import chess.ChessMatch;
import boardgame.Board;

public class Program {

	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();
		
		Board board = new Board(8,8);
		UI.printBoard(chessMatch.getPieces());

	}

}
