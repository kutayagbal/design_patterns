package creational.singleton.maze;

public class Test {

	public static void main(String... args) {
		MazeFactory factory = MazeFactory.getInstance();
		MazeGame game = new MazeGame();
		Maze maze = game.createMaze(factory);
		System.out.println(maze);
	}

}
