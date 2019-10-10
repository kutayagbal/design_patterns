package creational.builder.maze;

class Room extends MapSite {
	private int roomNo;
	private MapSite[] sides;

	public Room(int roomNo) {
		this.roomNo = roomNo;
		this.sides = new MapSite[4];
	}

	public int getRoomNo() {
		return this.roomNo;
	}

	public void setSide(Direction direction, MapSite site) {
		sides[direction.ordinal()] = site;
	}
	
	public MapSite getSide(Direction direction) {
		return sides[direction.ordinal()];
	}
	
	@Override
	public String toString() {
		return "Room number " + roomNo;
	}
}
