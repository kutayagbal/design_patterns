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
	
	int[] getCounts() {
		return new int[] {doorCount, roomCount};
	}

}
