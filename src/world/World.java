package world;

import java.util.ArrayList;

public class World {
	
	public String name;
	public ArrayList<Dimension> world = new ArrayList<Dimension>();
	
	public World(boolean tial) {
		world.add(new Dimension(0, tial));
	}

	public World(String name, boolean tial) {
		world.add(new Dimension(0,tial));
		this.name = name;
	}
}
