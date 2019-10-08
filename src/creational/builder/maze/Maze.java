package creational.builder.maze;

import java.util.HashMap;
import java.util.Map;

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
}
