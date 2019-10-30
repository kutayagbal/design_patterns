package creational.prototype.maze;

//May be an abstract class but then we need a StandardWall class for a standard wall.
class Wall extends MapSite {
	@Override
	void enter() {
		System.out.println("You can not enter into a Standard Wall");
	}

	@Override
	public String toString() {
		return "Standart Wall";
	}

}
