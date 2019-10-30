package creational.prototype.maze;

public class MazeGame {
	// standart prototyping
	Maze createMaze(MazeFactory factory) throws CloneNotSupportedException {
		Maze maze = factory.makeMaze();
		Room room1 = factory.makeRoom(1);
		Room room2 = factory.makeRoom(2);
		Door door = factory.makeDoor(room1, room2);

		maze.addRoom(room1);
		maze.addRoom(room2);

		room1.setSide(Direction.NORTH, factory.makeWall());
		room1.setSide(Direction.EAST, door);
		room1.setSide(Direction.SOUTH, factory.makeWall());
		room1.setSide(Direction.WEST, factory.makeWall());

		room2.setSide(Direction.NORTH, factory.makeWall());
		room2.setSide(Direction.EAST, factory.makeWall());
		room2.setSide(Direction.SOUTH, factory.makeWall());
		room2.setSide(Direction.WEST, door);

		return maze;
	}

	// catalog based prototyping
	Maze createMazeWithCatalog(MazeFactory factory) throws CloneNotSupportedException {
		Maze maze = (Maze) factory.makePart("maze");
		Room room1 = (Room) factory.makePart("room");
		room1.initialize(1);

		Room room2 = (Room) factory.makePart("room");
		room2.initialize(2);

		Door door = (Door) factory.makePart("door");
		door.initialize(room1, room2);

		maze.addRoom(room1);
		maze.addRoom(room2);

		room1.setSide(Direction.NORTH, (Wall) factory.makePart("wall"));
		room1.setSide(Direction.EAST, door);
		room1.setSide(Direction.SOUTH, (Wall) factory.makePart("wall"));
		room1.setSide(Direction.WEST, (Wall) factory.makePart("wall"));

		room2.setSide(Direction.NORTH, (Wall) factory.makePart("wall"));
		room2.setSide(Direction.EAST, (Wall) factory.makePart("wall"));
		room2.setSide(Direction.SOUTH, (Wall) factory.makePart("wall"));
		room2.setSide(Direction.WEST, door);

		return maze;
	}
}
