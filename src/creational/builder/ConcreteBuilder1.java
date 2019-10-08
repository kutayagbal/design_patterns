package creational.builder;

public class ConcreteBuilder1 extends AbstractBuilder {
	private Product1 p1;

	public ConcreteBuilder1() {
		this.p1 = new Product1();
	}

	@Override
	void buildPart1() {
		p1.setPart1("This is first part of Product1");
	}

	@Override
	void buildPart2() {
		p1.setPart2("This is last part of Product1");
	}

	Product1 getProduct1() {
		return this.p1;
	}
}
