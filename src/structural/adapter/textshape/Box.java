package structural.adapter.textshape;

public class Box {
	Point bottomLeft;
	Point topRight;

	public Box(Point bl, Point tr) {
		bottomLeft = bl;
		topRight = tr;
	}

	@Override
	public String toString() {
		return "Box [bottomLeft=" + bottomLeft + ", topRight=" + topRight + "]";
	}

}
