package boardgame;

public class Position {
	private int row;
	private int column;
	
	public Position(int rom, int column) {
		this.row = rom;
		this.column = column;
	}

	public int getRom() {
		return row;
	}

	public void setRom(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
}
