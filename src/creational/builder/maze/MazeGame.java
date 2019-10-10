package creational.builder.maze;

public class MazeGame {
	void createMaze(MazeBuilder builder) {
		builder.buildMaze();

		builder.buildRoom(1);
		builder.buildRoom(2);
		builder.buildDoor(1, 2);
	}
	
	void createComplexMaze(MazeBuilder builder) {
		builder.buildRoom(1);
		builder.buildRoom(2);
		builder.buildRoom(3);
		//...
		builder.buildRoom(1001);
	}
}
