package structural.adapter.textshape;

public class StandartShape extends Shape {
	Point topLeft;
	Point bottomRight;

	@Override
	Box boundingBox() {
		return new Box(this.topLeft, this.bottomRight);
	}

	@Override
	boolean isEmpty() {
		return false;
	}

	@Override
	Manipulator createManipulator() {
		return new SimpleShapeManipulator();
	}

}
