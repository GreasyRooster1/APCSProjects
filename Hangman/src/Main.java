public class Main {
    private static GameState gameState = new GameState();
    private static Renderer renderer = new Renderer();
    public static void main(String[] args) {
        renderer.render(gameState);
    }
}