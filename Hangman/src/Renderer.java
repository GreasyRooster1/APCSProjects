import java.util.ArrayList;

public class Renderer {
    public final static int WIDTH = 30;
    public final static int HEIGHT = 10;

    public void render(GameState state){
        ArrayList<ArrayList<Character>> screen = new ArrayList<>();
        for (int i = 0; i < HEIGHT; i++) {
            ArrayList<Character> tmp = new ArrayList<>();
            for (int j = 0; j < WIDTH; j++) {
                tmp.add(' ');
            }
            screen.add(tmp);
        }

        renderMan(screen);
        renderBorder(screen);

        print(screen);
    }

    public void print(ArrayList<ArrayList<Character>> screen) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                out.append(screen.get(i).get(j));
            }
            out.append("\n");
        }
        System.out.println(out);
    }

    public void renderMan(ArrayList<ArrayList<Character>> screen){
        screen.get(2).set(4,'0');
    }

    public void renderBorder(ArrayList<ArrayList<Character>> screen){
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if(j==0||j==WIDTH-1||i==0||i==HEIGHT-1){
                    screen.get(i).set(j,'#');
                }
            }
        }
    }
}
