package structural.bridge;

public class ConcreteImplementorB extends Implementor {
	@Override
	void operationImpl_1() {
		System.out.println(this.toString() + ": operationImpl_1 running.");
	}

	@Override
	void operationImpl_2() {
		System.out.println(this.toString() + ": operationImpl_2 running.");
	}
}
