package creational.factory_method.maze;

public class Test {

	public static void main(String[] args) {
		MazeGame game = new MazeGame();
		Maze maze = game.createMaze();
		System.out.println(maze);
		
		game = new BombedMazeGame();
		maze = game.createMaze();
		System.out.println(maze);
		
		game = new EnchantedMazeGame();
		maze = game.createMaze();
		System.out.println(maze);
	}

}
