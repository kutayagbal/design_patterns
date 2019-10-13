package creational.builder.maze;

import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		StringBuffer buf = new StringBuffer("Standart Room No: " + roomNo + " ");
		buf.append("with sides: \n");

		buf.append(Stream.of(sides).map(e -> e.toString()).collect(Collectors.joining(", ")));
		return buf.toString();
	}
}
