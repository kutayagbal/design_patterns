package creational.factory_method.maze;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EnchantedRoom extends Room {

	public EnchantedRoom(int roomNo) {
		super(roomNo);
	}
	
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer("Enchanted Room No: " + super.getRoomNo() + " ");
		buf.append("with sides: \n");

		buf.append(Stream.of(super.sides).map(e -> e.toString()).collect(Collectors.joining(", ")));
		return buf.toString();
	}
}
