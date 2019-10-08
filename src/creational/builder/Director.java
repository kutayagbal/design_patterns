package creational.builder;

public class Director {
	private AbstractBuilder builder;

	public Director(AbstractBuilder builder) {
		this.builder = builder;
	}

	Product2 construct() {
		String[] arr = { "a", "bb", "ccc", "d" };
		for (String s : arr) {
			if (s.length() == 1)
				builder.buildPart1();
			else if (s.length() == 2)
				builder.buildPart2();
			else
				builder.buildPart3();
		}

		return ((ConcreteBuilder2) builder).getProduct2();
	}
}
