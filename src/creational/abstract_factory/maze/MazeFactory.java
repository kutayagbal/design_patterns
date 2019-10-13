package creational.abstract_factory.maze;

/* May be an abstract class. 
 * This variation is concrete to get a standard maze with MazeFactory instance. 
 * Otherwise we should create a StandardMazeFactor class that creates standard components.
 */
public class MazeFactory {
	Maze makeMaze() {
		return new Maze();
	}

	Wall makeWall() {
		return new Wall();
	}

	Room makeRoom(int roomNo) {
		return new Room(roomNo);
	}

	Door makeDoor(Room r1, Room r2) {
		return new Door(r1, r2); 
	}
}
