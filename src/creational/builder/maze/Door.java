package creational.builder.maze;

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

}
