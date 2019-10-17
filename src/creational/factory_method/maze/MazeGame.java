package creational.factory_method.maze;

/* May be an abstract class. 
 * This variation is concrete to get a standard maze with MazeGame instance. 
 * Otherwise we should create a StandardMazeGame class that creates a standard maze.
 */
public class MazeGame {
	Maze createMaze() {
		Maze maze = makeMaze();

		Room r1 = makeRoom(1);
		Room r2 = makeRoom(2);
		Door door = makeDoor(r1, r2);

		maze.addRoom(r1);
		maze.addRoom(r2);

		r1.setSide(Direction.NORTH, makeWall());
		r1.setSide(Direction.EAST, door);
		r1.setSide(Direction.SOUTH, makeWall());
		r1.setSide(Direction.WEST, makeWall());

		r2.setSide(Direction.NORTH, makeWall());
		r2.setSide(Direction.EAST, makeWall());
		r2.setSide(Direction.SOUTH, makeWall());
		r2.setSide(Direction.WEST, door);

		return maze;
	}

	// factory methods	--------------------
	Maze makeMaze() {
		return new Maze();
	}

	Room makeRoom(int roomNo) {
		return new Room(roomNo);
	}

	Wall makeWall() {
		return new Wall();
	}

	Door makeDoor(Room r1, Room r2) {
		return new Door(r1, r2);
	}
	// factory methods	--------------------
	
	@Override
	public String toString() {
		return "This is a Maze Game.";
	}
}
