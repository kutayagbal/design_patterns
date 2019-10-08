package creational.abstract_factory.maze;

public class BombedMazeFactory extends MazeFactory{
	@Override
	Wall makeWall() {
		return new BombedWall();
	}
	
	@Override
	Room makeRoom(int roomNo) {
		return new RoomWithABomb(roomNo);
	}
}
