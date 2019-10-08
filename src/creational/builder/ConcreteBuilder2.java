package creational.builder;

public class ConcreteBuilder2 extends AbstractBuilder {
	private Product2 p2;

	public ConcreteBuilder2() {
		this.p2 = new Product2();
	}

	@Override
	void buildPart1() {
		p2.setPart1("This is first part of Product2");
	}

	@Override
	void buildPart3() {
		p2.setPart3("This is last part of Product2");
	}

	Product2 getProduct2() {
		return this.p2;
	}
}
