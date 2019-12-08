package structural.bridge.window;

import java.util.Random;

public abstract class Window {
	private WindowImpl impl;
	private View contents;

	public Window(View contents) {
		this.contents = contents;
	}

	/*
	 * How does a window obtain an instance of the right WindowImp subclass? We'll
	 * assume Window has that responsibility in this example. Its GetWindowImp
	 * operation gets the right instance from an abstract factory that effectively
	 * encapsulates all window system specifics.
	 */
	protected WindowImpl getWindowImpl() {
		if (impl == null) {
			// WindowSystemFactory.getInstance().makeWindowImpl();
			if (new Random().nextBoolean())
				return new PMwindowImpl();
			else
				return new XWindowImp();
		}

		return impl;
	}

	protected View getView() {
		return this.contents;
	}

	abstract void drawContents();

}
