package creational.builder.maze;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Maze{
	
	private Map<Integer, Room> rooms;
	
	public Maze() {
		rooms = new HashMap<>();
	}
	
	void addRoom(Room r) {
		rooms.put(r.getRoomNo(), r);
	}
	
	Room getRoom(int roomNo) {
		return rooms.get(roomNo);
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer("The Maze has " + rooms.size() + " rooms: \n");

		buf.append(rooms.entrySet().stream().map(e -> e.getValue().toString()).collect(Collectors.joining("\n")));
		return buf.append("\n").toString();
	}
}
