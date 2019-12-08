package structural.bridge;

public abstract class Abstraction {
	private Implementor implementor;

	public Abstraction(Implementor imp) {
		this.implementor = imp;
	}

	protected Implementor getImplementor() {
		return this.implementor;
	}

	abstract void operation();
}
