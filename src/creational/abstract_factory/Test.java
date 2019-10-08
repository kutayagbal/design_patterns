package creational.abstract_factory;

public class Test {

	public static void main(String[] args) {
		AbstractFactory factory = new ConcreteFactory1();
		
		AbstractProductA a = factory.createProductA();
		AbstractProductB b = factory.createProductB();
		
		System.out.println(a);
		System.out.println(b);
		
		factory = new ConcreteFactory2();
		
		a = factory.createProductA();
		b = factory.createProductB();
		
		System.out.println(a);
		System.out.println(b);
	}

}
