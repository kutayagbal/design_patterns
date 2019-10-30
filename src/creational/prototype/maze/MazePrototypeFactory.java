package creational.prototype.maze;

public class MazePrototypeFactory extends MazeFactory {
	private Maze _prototypeMaze;
	private Room _prototypeRoom;
	private Door _prototypeDoor;
	private Wall _prototypeWall;

	public MazePrototypeFactory(Maze mazePrototype, Room roomPrototype, Door doorPrototype, Wall wallPrototype) {
		this._prototypeMaze = mazePrototype;
		this._prototypeRoom = roomPrototype;
		this._prototypeDoor = doorPrototype;
		this._prototypeWall = wallPrototype;
	}

	@Override
	Maze makeMaze() throws CloneNotSupportedException {
		return (Maze) _prototypeMaze.clone();
	}

	@Override
	Wall makeWall() throws CloneNotSupportedException {
		return (Wall) _prototypeWall.clone();
	}

	@Override
	Room makeRoom(int roomNo) throws CloneNotSupportedException {
		Room r = (Room) _prototypeRoom.clone();
		r.initialize(roomNo);
		return r;
	}

	@Override
	Door makeDoor(Room r1, Room r2) throws CloneNotSupportedException {
		Door d = (Door) _prototypeDoor.clone();
		d.initialize(r1, r2);
		return d;
	}

}
