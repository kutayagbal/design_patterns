package creational.abstract_factory.maze;

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
