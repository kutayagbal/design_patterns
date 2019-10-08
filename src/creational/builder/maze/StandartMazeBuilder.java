package creational.builder.maze;

public class StandartMazeBuilder extends MazeBuilder {

	private Maze currentMaze;

	Direction commonWall(Room r1, Room r2) {
		if (r1.getSide(Direction.EAST) == r2)
			return Direction.EAST;
		else if (r1.getSide(Direction.NORTH) == r2)
			return Direction.NORTH;
		else if (r1.getSide(Direction.SOUTH) == r2)
			return Direction.SOUTH;
		else
			return Direction.WEST;
	}

	@Override
	void buildMaze() {
		currentMaze = new Maze();
	}

	@Override
	void buildRoom(int roomNo) {
		Room room = new Room(roomNo);
		currentMaze.addRoom(room);
		room.setSide(Direction.NORTH, new Wall());
		room.setSide(Direction.SOUTH, new Wall());
		room.setSide(Direction.EAST, new Wall());
		room.setSide(Direction.WEST, new Wall());
	}

	@Override
	void buildDoor(int roomFrom, int roomTo) {
		Room r1 = currentMaze.getRoom(roomFrom);
		Room r2 = currentMaze.getRoom(roomTo);
		Door d = new Door(r1, r2);

		r1.setSide(commonWall(r1, r2), d);
		r2.setSide(commonWall(r2, r1), d);
	}

	@Override
	Maze getMaze() {
		return currentMaze;
	}

}
