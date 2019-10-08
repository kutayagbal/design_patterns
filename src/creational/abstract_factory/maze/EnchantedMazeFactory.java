package creational.abstract_factory.maze;

public class EnchantedMazeFactory extends MazeFactory {
	@Override
	Room makeRoom(int roomNo) {
		return new EnchantedRoom(roomNo);
	}

	@Override
	Door makeDoor(Room r1, Room r2) {
		return new DoorNeedingSpell(r1, r2);
	}

}
