package creational.singleton;

public class Test {

	public static void main(String... args) {
		Singleton s = Singleton.getInstance();
		System.out.println(s);
	}
}