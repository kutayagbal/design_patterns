package structural.bridge;

public class ConcreteImplementorA extends Implementor{
	@Override
	void operationImpl_1() {
		System.out.println(this.toString() + ": operationImpl_1 running.");
	}
}
