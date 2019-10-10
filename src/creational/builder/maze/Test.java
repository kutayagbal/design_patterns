package creational.builder.maze;

public class Test {

	public static void main(String[] args) {
		MazeGame game = new MazeGame();
		StandartMazeBuilder stdBuilder = new StandartMazeBuilder();

		game.createMaze(stdBuilder);
		Maze maze = stdBuilder.getMaze();
		System.out.println(maze.toString());

		CountingMazeBuilder cntBuilder = new CountingMazeBuilder();
		game.createMaze(cntBuilder);

		System.out.println("The maze has " + cntBuilder.getRoomCount() + " rooms and " + cntBuilder.getDoorCount() + " doors");
	}
}
