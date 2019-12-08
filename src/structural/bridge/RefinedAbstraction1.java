package structural.bridge;

public class RefinedAbstraction1 extends Abstraction {

	public RefinedAbstraction1(Implementor imp) {
		super(imp);
	}

	@Override
	public void operation() {
		System.out.println(this.toString() + " calling...");
		super.getImplementor().operationImpl_1();
	}

}
