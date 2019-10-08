package creational.abstract_factory.maze;

public class TestMazeGame {

	public static void main(String[] args) {
		MazeFactory factory = new EnchantedMazeFactory();//new BombedMazeFactory();//new DefaultMazeFactory();
		MazeGame game = new MazeGame();
		
		game.createMaze(factory);
	}

}
