package creational.prototype.maze;

public class MazeFactory {
	Maze makeMaze() throws CloneNotSupportedException {
		return new Maze();
	}

	Wall makeWall() throws CloneNotSupportedException {
		return new Wall();
	}

	Room makeRoom(int roomNo) throws CloneNotSupportedException {
		return new Room(roomNo);
	}

	Door makeDoor(Room r1, Room r2) throws CloneNotSupportedException {
		return new Door(r1, r2);
	}
	
	public MapSite makePart(String partName) throws CloneNotSupportedException {
		return null;
	}
}
