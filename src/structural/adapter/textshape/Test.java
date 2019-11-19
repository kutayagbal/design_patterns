package structural.adapter.textshape;

public class Test {

	public static void main(String... args) {
		TextShape textShape = new TextShape(new TextView());
		
		textShape.addStr("aksdj");
		System.out.println(textShape.boundingBox());

		StandartShape stdShape = new StandartShape();
		System.out.println(stdShape.boundingBox());

	}

}
