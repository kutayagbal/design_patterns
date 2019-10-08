package creational.builder.maze;

public class MazeGame {
	Maze createMaze(MazeBuilder builder) {
		builder.buildMaze();

		builder.buildRoom(1);
		builder.buildRoom(2);
		builder.buildDoor(1, 2);

		return builder.getMaze();
	}
	
	Maze createComplexMaze(MazeBuilder builder) {
		builder.buildRoom(1);
		builder.buildRoom(2);
		builder.buildRoom(3);
		//...
		builder.buildRoom(1001);
		
		return builder.getMaze();
	}
}
