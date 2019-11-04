package creational.singleton.maze;

public class MazeFactory {
	private static MazeFactory _instance;

	private MazeFactory() {
	}

	public static MazeFactory getInstance() {
		if (_instance == null) {
			synchronized (MazeFactory.class) {
				if (_instance == null) {
					_instance = new MazeFactory();
				}
			}
		}

		return _instance;
	}

	Maze makeMaze() {
		return new Maze();
	}

	Wall makeWall() {
		return new Wall();
	}

	Room makeRoom(int roomNo) {
		return new Room(roomNo);
	}

	Door makeDoor(Room r1, Room r2) {
		return new Door(r1, r2);
	}
}
