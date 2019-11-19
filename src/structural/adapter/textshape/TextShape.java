package structural.adapter.textshape;

//Adapter
public class TextShape extends Shape {
	private TextView text;

	public TextShape(TextView tv) {
		this.text = tv;
	}

	@Override
	Box boundingBox() {
		Point bottomLeft = new Point(text.getOriginX() - (text.getWidth() / 2),
				text.getOriginY() - (text.getHeight() / 2));
		Point topRight = new Point(text.getOriginX() + (text.getWidth() / 2),
				text.getOriginY() + (text.getHeight() / 2));
		return new Box(bottomLeft, topRight);
	}

	@Override
	boolean isEmpty() {
		return text.isEmpty();
	}

	@Override
	Manipulator createManipulator() {
		return new SimpleShapeManipulator();
	}

	void addStr(String str) {
		text.addStr(str);
	}

}
