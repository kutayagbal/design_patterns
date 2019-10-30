package creational.prototype.maze;

import java.util.HashMap;
import java.util.Map;

public class MazePrototypeFactoryWithCatalog extends MazeFactory {
	private Map<String, MapSite> catalog = new HashMap<>();

	public MazePrototypeFactoryWithCatalog(Maze mazePrototype, Room roomPrototype, Door doorPrototype,
			Wall wallPrototype) {
		catalog.put("maze", mazePrototype);
		catalog.put("room", roomPrototype);
		catalog.put("door", doorPrototype);
		catalog.put("wall", wallPrototype);
	}

	@Override
	public MapSite makePart(String partName) throws CloneNotSupportedException {
		return catalog.get(partName).clone();
	}

}
