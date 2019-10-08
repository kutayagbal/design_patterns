package creational.abstract_factory.maze;

public class DefaultRoom extends Room {

	public DefaultRoom(int roomNo) {
		super(roomNo);
	}

	@Override
	void enter() {
		System.out.println("You are in the room " + getRoomNo());
	}

}
