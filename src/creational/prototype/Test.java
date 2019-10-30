package creational.prototype;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Foo foo = new Foo("foo value is here");

		Prototype proto1 = new ConcretePrototype1("F1", foo);
		Prototype proto2 = proto1.clone();
		Prototype proto3 = new ConcretePrototype2();
		Prototype proto4 = proto3.clone();

		foo.foo = "If you dont make deep copy, both references hold the same memory address";

		System.out.println(proto1);
		System.out.println(proto2);
		System.out.println(proto3);
		System.out.println(proto4);
	}

}
