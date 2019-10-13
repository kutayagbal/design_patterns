package creational.factory_method;

public class ConcreteCreator1 extends AbstractCreator {

	@Override
	AbstractProduct factoryMethod() {
		return new Product1();
	}

}
