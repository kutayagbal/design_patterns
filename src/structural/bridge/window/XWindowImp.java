package structural.bridge.window;

public class XWindowImp extends WindowImpl {
	private int dpy;

	@Override
	void deviceBitmap(String bitmapName, double d, double e) {
		System.out.println(toString() + " This OS does not draw bitmaps");
	}

	@Override
	void deviceRect(int x0, int y0, int x1, int y1) {
		System.out.println(toString() + " Drawing rectangle for X Window OS.");
	}

	@Override
	void deviceText(String text, double x, double y) {
		System.out.println(toString() + " Drawing " + text + " on x:" + x + " y:" + y);
	}

}
