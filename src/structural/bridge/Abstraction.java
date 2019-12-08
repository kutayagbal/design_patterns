package structural.bridge;

public abstract class Abstraction {
	protected Implementor implementor;

	public Abstraction(Implementor imp) {
		this.implementor = imp;
	}

	public void operation() {
	}
}
