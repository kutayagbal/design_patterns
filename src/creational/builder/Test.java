package creational.builder;

public class Test {

	public static void main(String[] args) {
		ConcreteBuilder1 builder1 = new ConcreteBuilder1();
		Director director = new Director(builder1);
		
		director.construct();
		System.out.println(builder1.getProduct1());

		ConcreteBuilder2 builder2 = new ConcreteBuilder2();
		director.setBuilder(builder2);
		
		director.construct();
		System.out.println(builder2.getProduct2());
	}
}
