package creational.factory_method;

public class Test {

	public static void main(String[] args) {
		AbstractCreator creator = new ConcreteCreator1(); 
		AbstractProduct product = creator.factoryMethod();
		
		System.out.println(product);
		
		creator = new ConcreteCreator2();
		product = creator.factoryMethod();
		
		System.out.println(product);
	}
}
