package board;

public class Board {
	
	public int x;
	public int y;
	
	public int rows;
	public int columns;
	
	
	public int[][] board;
	
	public Board(int y, int x) {
		rows = y;
		columns = x;
		board = new int[y][x];
	}
	
	public Board(int x, int y, int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		board = new int[rows][columns];
		this.x = x;
		this.y = y;
	}
}
