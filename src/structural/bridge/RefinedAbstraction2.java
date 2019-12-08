package structural.bridge;

public class RefinedAbstraction2 extends Abstraction {

	public RefinedAbstraction2(Implementor imp) {
		super(imp);
	}

	@Override
	public void operation() {
		System.out.println(this.toString() + " calling...");
		super.getImplementor().operationImpl_1();
		super.getImplementor().operationImpl_2();
	}

}
