package creational.prototype.maze;

public abstract class MapSite implements Cloneable {
	abstract void enter();

	@Override
	protected MapSite clone() throws CloneNotSupportedException {
		return (MapSite) super.clone();
	}
}
