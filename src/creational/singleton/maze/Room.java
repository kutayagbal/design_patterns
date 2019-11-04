package creational.singleton.maze;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//May be an abstract class but then we need a StandardRoom class for a standard room.
class Room extends MapSite {
	private int roomNo;
	protected MapSite[] sides;

	public Room(int roomNo) {
		this.roomNo = roomNo;
		this.sides = new MapSite[4];
	}

	public int getRoomNo() {
		return this.roomNo;
	}

	void enter() {
		System.out.println("You're now in Standart Room " + roomNo);
	}

	public void setSide(Direction direction, MapSite site) {
		sides[direction.ordinal()] = site;
	}
	
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer("Standart Room No: " + roomNo + " ");
		buf.append("with sides: \n");

		buf.append(Stream.of(sides).map(e -> e.toString()).collect(Collectors.joining(", ")));
		return buf.toString();
	}
}
