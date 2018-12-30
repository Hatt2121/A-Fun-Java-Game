package tile;

public class Tile {

	String name;
	String character;
	
	public Tile(String character) {
		this.character = character;
	}
	
	public Tile(String character, String name) {
		this.character = character;
		this.name = name;
	}
}
