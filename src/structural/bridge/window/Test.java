package structural.bridge.window;

public class Test {

	public static void main(String[] args) {
		Window window = new ApplicationVindow(new View());
		window.drawContents();
		
		window = new IconWindow(new View());
		window.drawContents();
	}

}
