package creational.builder;

public class ConcreteBuilder2 extends AbstractBuilder {
	private Product2 p2;

	public ConcreteBuilder2() {
		this.p2 = new Product2();
	}

	@Override
	void buildPart1() {
		p2.setPart1("B1");
	}

	@Override
	void buildPart3() {
		p2.setPart3("B2");
	}

	Product2 getProduct2() {
		return this.p2;
	}
}
