package creational.abstract_factory.maze;

public class DoorNeedingSpell extends Door {

	public DoorNeedingSpell(Room r1, Room r2) {
		super(r1, r2);
	}

	@Override
	void enter() {
		System.out.println("Say the Spell to enter");
	}
	
	@Override
	public String toString() {
		return "Door Needing Spell between Room " + super.getRoom1().getRoomNo() + " Room "
				+ super.getRoom2().getRoomNo();
	}

}
