package creational.abstract_factory.maze;

import java.util.HashMap;
import java.util.Map;

abstract class Maze extends MapSite {

	private Map<Integer, Room> rooms;

	public Maze() {
		rooms = new HashMap<>();
	}

	void addRoom(Room r) {
		rooms.put(r.getRoomNo(), r);
	}

	@Override
	void enter() {

	}

	Room getRoom(int roomNo) {
		return rooms.get(roomNo);
	}
}
