package boardgame;

public class Board extends Position {

	private int columns;
	private int rows;
	private Piece[][] pieces;
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Position position(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public Board(int columns, int rows) {
		super();
		this.columns = columns;
		this.rows = rows;
		pieces = new Piece[rows][columns];
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
	
}
