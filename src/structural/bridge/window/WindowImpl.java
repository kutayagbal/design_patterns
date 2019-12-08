package structural.bridge.window;

public abstract class WindowImpl {

	protected WindowImpl() {
	}

	abstract void deviceBitmap(String bitmapName, double d, double e);
	abstract void deviceText(String text, double x, double y);
	abstract void deviceRect(int x0, int y0, int x1, int y1);
}
