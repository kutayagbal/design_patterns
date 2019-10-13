package creational.factory_method.maze;

public class BombedMazeGame extends MazeGame {

	@Override
	Wall makeWall() {
		return new BombedWall();
	}

	@Override
	Room makeRoom(int roomNo) {
		return new RoomWithABomb(roomNo);
	}
	
	@Override
	public String toString() {
		return "This is a Bombed Maze Game.";
	}
}
