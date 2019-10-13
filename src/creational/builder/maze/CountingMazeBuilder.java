package creational.builder.maze;

public class CountingMazeBuilder extends MazeBuilder {
	private int doorCount;
	private int roomCount;

	@Override
	void buildRoom(int roomNo) {
		roomCount++;
	}

	@Override
	void buildDoor(int roomFrom, int roomTo) {
		doorCount++;
	}
	
	void countMaze() {
		System.out.println("Counting the maze: " + roomCount + " rooms and " + doorCount + " doors");
	}
}
