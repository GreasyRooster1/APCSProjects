public class Main {
    private static GameState gameState = new GameState();
    private static Renderer renderer = new Renderer();
    private static Runner runner = new Runner();
    public static void main(String[] args) {
        gameState.setup();
        while (gameState.isRunning()) {
            step(gameState);
        }
    }
    public static void step(GameState gameState){
        renderer.render(gameState);
        runner.run(gameState);
    }
}