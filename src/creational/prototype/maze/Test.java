package creational.prototype.maze;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		MazePrototypeFactory simpleMazeFactory = new MazePrototypeFactory(new Maze(), new Room(), new Door(),
				new Wall());
		MazeGame game = new MazeGame();
		Maze maze = game.createMaze(simpleMazeFactory);
		System.out.println(maze);

		MazePrototypeFactory bombedMazeFactory = new MazePrototypeFactory(new Maze(), new RoomWithABomb(), new Door(),
				new BombedWall());
		maze = game.createMaze(bombedMazeFactory);
		System.out.println(maze);

		MazePrototypeFactory enchantedMazeFactory = new MazePrototypeFactory(new Maze(), new EnchantedRoom(),
				new DoorNeedingSpell(), new Wall());
		maze = game.createMaze(enchantedMazeFactory);
		System.out.println(maze);

		// catalog based prototyping
		MazePrototypeFactoryWithCatalog bombedMazeFactoryWithCatalog = new MazePrototypeFactoryWithCatalog(
				new Maze(), new RoomWithABomb(), new Door(), new BombedWall());
		maze = game.createMazeWithCatalog(bombedMazeFactoryWithCatalog);
		System.out.println(maze);
	}
}
