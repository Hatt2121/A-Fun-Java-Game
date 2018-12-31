package world;

import java.util.ArrayList;
import board.Board;
import tile.Tile;

public class Dimension {

	public boolean type;
	public int level;
	public int DEFAULT;
	public ArrayList<Board> list = new ArrayList<Board>();
	public ArrayList<ArrayList<Tile>> world = new ArrayList<ArrayList<Tile>>();
	
	public Dimension(int level, boolean type) {
		this.level = level;
		this.type = type;
		if(type == false) {
			list.add(new Board(0,0,DEFAULT,DEFAULT));
		} else {
			//Initialize world using the ArrayList
		}
	}
	
	
}
