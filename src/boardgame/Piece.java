package boardgame;

public class Piece extends Position {

	protected Position position;
	private Board board;

	public Piece() {
		super();
	}

	public Piece(Board board) {
		super();
		this.board = board;
		position = null;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	protected Board getBoard() {
		return board;
	}


	Piece[][] possibleMoves() {
		return null;
	}

	
}
