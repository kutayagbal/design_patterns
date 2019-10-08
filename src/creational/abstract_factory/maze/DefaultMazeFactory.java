package creational.abstract_factory.maze;

public class DefaultMazeFactory extends MazeFactory {
	@Override
	Room makeRoom(int n) {
		return new DefaultRoom(n);
	}

	@Override
	Door makeDoor(Room r1, Room r2) {
		return new DefaultDoor(r1, r2);
	}

}
