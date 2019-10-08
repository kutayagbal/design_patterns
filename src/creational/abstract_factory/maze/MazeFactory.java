package creational.abstract_factory.maze;

public abstract class MazeFactory {
	Maze makeMaze() {
		return new DefaultMaze();
	}

	Wall makeWall() {
		return new DefaultWall();
	}

	Room makeRoom(int roomNo) {
		return new DefaultRoom(roomNo);
	}

	Door makeDoor(Room r1, Room r2) {
		return new DefaultDoor(r1, r2); 
	}
}
