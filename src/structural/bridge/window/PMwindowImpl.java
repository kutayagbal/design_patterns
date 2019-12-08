package structural.bridge.window;

public class PMwindowImpl extends WindowImpl {
	private int hps;

	@Override
	void deviceBitmap(String bitmapName, double d, double e) {
		System.out.println(toString() + " Drawing bitmap for IBM Presentation Manager.");
	}

	@Override
	void deviceRect(int x0, int y0, int x1, int y1) {
		System.out.println(toString() + " Drawing rectangle for IBM Presentation Manager.");
	}

	@Override
	void deviceText(String text, double x, double y) {
		System.out.println(toString() + " Drawing " + text + " on x:" + x + " y:" + y);
	}

}
