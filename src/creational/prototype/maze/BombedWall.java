package creational.prototype.maze;

public class BombedWall extends Wall {

	@Override
	void enter() {
		super.enter();
	}

	@Override
	public String toString() {
		return "Bombed Wall";
	}
}
