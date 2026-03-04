public class App {

    public static void main(String[] args) {

        // creating instances
        GameConfig config = new GameConfig(4, 1, 50);
        CountingGame game = new CountingGame(config);

        //actually running the game
        game.runGame();


    }

}
