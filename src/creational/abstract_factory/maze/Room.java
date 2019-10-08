package creational.abstract_factory.maze;

abstract class Room extends MapSite {
	private int roomNo;
	private MapSite[] sides;

	public Room(int roomNo) {
		this.roomNo = roomNo;
		this.sides = new MapSite[4];
	}

	public int getRoomNo() {
		return this.roomNo;
	}

	abstract void enter();

	public void setSide(Direction direction, MapSite site) {
		sides[direction.ordinal()] = site;
	}
}
