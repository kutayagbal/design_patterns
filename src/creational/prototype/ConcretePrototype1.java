package creational.prototype;

public class ConcretePrototype1 extends Prototype {
	private String field1;
	private Foo field2;

	public ConcretePrototype1(String field1, Foo foo) {
		this.field1 = field1;
		this.field2 = foo;
	}

	@Override
	public ConcretePrototype1 clone() throws CloneNotSupportedException {
		ConcretePrototype1 cloned = (ConcretePrototype1) super.clone();
		cloned.field2 = new Foo(field2 != null ? field2.foo : null); // deep copy
		return cloned;
	}

	public String getField1() {
		return field1;
	}

	@Override
	public String toString() {
		return "ConcretePrototype1 [field1=" + field1 + ", field2=" + field2 + "]";
	}

}
