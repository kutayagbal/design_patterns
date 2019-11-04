package creational.singleton.maze;

class Door extends MapSite {
	private boolean isOpen;
	private Room room1;
	private Room room2;

	public Door(Room r1, Room r2) {
		room1 = r1;
		room2 = r2;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public Room getRoom1() {
		return room1;
	}

	public Room getRoom2() {
		return room2;
	}

	@Override
	void enter() {
		if (!isOpen) {
			System.out.println("The door is closed.");
		}
	}
	
	@Override
	public String toString() {
		return "Standart Door between Room " + room1.getRoomNo() + " Room " + room2.getRoomNo();
	}
}
