package structural.bridge.window;

public class ApplicationVindow extends Window {

	public ApplicationVindow(View contents) {
		super(contents);
	}

	@Override
	void drawContents() {
		getView().drawOn(this);
	}

}
