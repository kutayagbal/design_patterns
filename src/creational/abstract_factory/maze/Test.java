package creational.abstract_factory.maze;

public class Test {

	public static void main(String[] args) {
		MazeFactory factory = new MazeFactory();
		MazeGame game = new MazeGame();
		Maze maze = game.createMaze(factory);
		System.out.println(maze);
		
		factory = new EnchantedMazeFactory();
		maze = game.createMaze(factory);
		System.out.println(maze);
		
		factory = new BombedMazeFactory();
		maze = game.createMaze(factory);
		System.out.println(maze);
	}

}
