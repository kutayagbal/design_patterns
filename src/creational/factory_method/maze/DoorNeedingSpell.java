package creational.factory_method.maze;

public class DoorNeedingSpell extends Door {

	public DoorNeedingSpell(Room r1, Room r2) {
		super(r1, r2);
	}

	@Override
	public String toString() {
		return "Door Needing Spell between Room " + super.getRoom1().getRoomNo() + " Room "
				+ super.getRoom2().getRoomNo();
	}
}
