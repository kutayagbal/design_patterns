package creational.factory_method.maze;

public class EnchantedMazeGame extends MazeGame {
	@Override
	Room makeRoom(int roomNo) {
		return new EnchantedRoom(roomNo);
	}

	@Override
	Door makeDoor(Room r1, Room r2) {
		return new DoorNeedingSpell(r1, r2);
	}

	@Override
	public String toString() {
		return "This is a Enchanted Maze Game.";
	}
}
