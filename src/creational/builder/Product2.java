package creational.builder;

public class Product2 {
	private String part1;
	private String part3;

	public String getPart1() {
		return part1;
	}

	public void setPart1(String part1) {
		this.part1 = part1;
	}

	public String getPart3() {
		return part3;
	}

	public void setPart3(String part3) {
		this.part3 = part3;
	}

	@Override
	public String toString() {
		return "Product2 [part1=" + part1 + ", part3=" + part3 + "]";
	}

}
