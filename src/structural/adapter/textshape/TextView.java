package structural.adapter.textshape;

//Adaptee
public class TextView {
	private int width;
	private int height = 2;
	private int originX;
	private int originY;

	private String text = "";

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getOriginX() {
		return originX;
	}

	public void setOriginX(int originX) {
		this.originX = originX;
	}

	public int getOriginY() {
		return originY;
	}

	public void setOriginY(int originY) {
		this.originY = originY;
	}

	public boolean isEmpty() {
		return false;
	}

	public void addStr(String str) {
		text.concat(str);
		width += str.length();
	}

}
