package structural.adapter.textshape;

//Target
public abstract class Shape {
	abstract Box boundingBox();

	abstract boolean isEmpty();

	abstract Manipulator createManipulator();

}
