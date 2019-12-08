package structural.bridge;

public class Test {

	public static void main(String[] args) {
		Implementor implementor = new ConcreteImplementorA();

		Abstraction abstraction = new RefinedAbstraction1(implementor);
		abstraction.operation();
		System.out.println();

		abstraction = new RefinedAbstraction2(implementor);
		abstraction.operation();
		System.out.println();

		implementor = new ConcreteImplementorB();
		abstraction = new RefinedAbstraction2(implementor);
		abstraction.operation();
	}

}
