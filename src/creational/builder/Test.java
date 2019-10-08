package creational.builder;

public class Test {

	public static void main(String[] args) {
		Director director = new Director(new ConcreteBuilder2());
		
		System.out.println(director.construct().toString());
	}

}
