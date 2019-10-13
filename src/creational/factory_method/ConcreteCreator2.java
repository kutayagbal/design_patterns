package creational.factory_method;

public class ConcreteCreator2 extends AbstractCreator {

	@Override
	AbstractProduct factoryMethod() {
		return new Product2();
	}

}
