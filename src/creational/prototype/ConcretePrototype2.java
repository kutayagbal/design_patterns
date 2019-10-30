package creational.prototype;

public class ConcretePrototype2 extends Prototype {
	private int field1 = 10;
	private int field2 = 200;

	@Override
	public ConcretePrototype2 clone() throws CloneNotSupportedException {
		return (ConcretePrototype2) super.clone(); // shallow copy is enough
	}

	public int getField1() {
		return field1;
	}

	public int getField2() {
		return field2;
	}

	@Override
	public String toString() {
		return "ConcretePrototype2 [field1=" + field1 + ", field2=" + field2 + "]";
	}

}
