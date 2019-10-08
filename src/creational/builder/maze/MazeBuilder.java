package creational.builder.maze;

public abstract class MazeBuilder {
	void buildMaze() {
	}

	void buildRoom(int room) {
	}

	void buildDoor(int roomFrom, int roomTo) {
	}

	Maze getMaze() {
		return null;
	}
	
	int[] getCounts() {
		return null;
	}
}
