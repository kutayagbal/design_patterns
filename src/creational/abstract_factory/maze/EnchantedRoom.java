package creational.abstract_factory.maze;

public class EnchantedRoom extends Room {

	public EnchantedRoom(int roomNo) {
		super(roomNo);
	}

	@Override
	void enter() {
		System.out.println("You are in the enchanted room " + getRoomNo());
	}

}
