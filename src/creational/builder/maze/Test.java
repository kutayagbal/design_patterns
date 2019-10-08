package creational.builder.maze;

public class Test {

	public static void main(String[] args) {
		MazeGame game = new MazeGame();
		MazeBuilder builder = new StandartMazeBuilder();

		game.createMaze(builder);
		Maze maze = builder.getMaze();

		builder = new CountingMazeBuilder();
		game.createMaze(builder);

		int[] counts = builder.getCounts();

		System.out.println("The maze has " + counts[1] + " rooms and " + counts[0] + " doors");

	}

}
