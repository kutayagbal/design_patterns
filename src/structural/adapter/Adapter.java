package structural.adapter;

public class Adapter extends Target {
	private Adaptee1 adaptee_1;
	private Adaptee2 adaptee_2;

	public Adapter() {
		this.adaptee_1 = new Adaptee1();
		this.adaptee_2 = new Adaptee2();
	}

	@Override
	void request() {
		System.out.println("Adapter received a request");
		adaptee_1.specificRequest();
		adaptee_2.specificRequest();
	}

	
}
