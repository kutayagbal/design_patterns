package creational.abstract_factory.maze;

public class DefaultDoor extends Door {

	public DefaultDoor(Room r1, Room r2) {
		super(r1, r2);
	}
	
	@Override
	void enter() {
		if(isOpen())
			System.out.println("Entering the door");
		else {
			System.out.println("The door is closed");
		}
	}
}
