package structural.bridge.window;

public class IconWindow extends Window {
	private String bitmapName; 

	public IconWindow(View contents) {
		super(contents);
	}
	
	@Override
	void drawContents() {
		getWindowImpl().deviceBitmap(bitmapName, 0.0, 0.0);
	}

}
