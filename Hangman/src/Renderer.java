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

        renderMan(screen,state);
        renderPuzzle(screen,state);
        renderBorder(screen);

        if(state.isWon()){
            renderWon(screen);
        }
        if(state.isLoss()){
            renderLoss(screen);
        }

        print(screen);
    }

    private void renderWon(ArrayList<ArrayList<Character>> screen) {
        String word = "YOU WIN!";
        for(int i = 0; i < word.length(); i++) {
            screen.get(5).set(i+7, word.charAt(i));
        }
    }
    private void renderLoss(ArrayList<ArrayList<Character>> screen) {
        String word = "YOU STINK!";
        for(int i = 0; i < word.length(); i++) {
            screen.get(5).set(i+7, word.charAt(i));
        }
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

    public void renderPuzzle(ArrayList<ArrayList<Character>> screen,GameState state){
        for(int i = 0; i < state.getCurrentPuzzle().length(); i++) {
            screen.get(8).set(i+4, state.getCurrentPuzzle().charAt(i));
        }
    }

    public void renderMan(ArrayList<ArrayList<Character>> screen,GameState state){
        if(state.getIncorrectGuesses()<1){return;}
        screen.get(2).set(4,'0');

        if(state.getIncorrectGuesses()<2){return;}
        screen.get(3).set(4,'|');

        if(state.getIncorrectGuesses()<3){return;}
        screen.get(4).set(3,'/');

        if(state.getIncorrectGuesses()<4){return;}
        screen.get(4).set(5,'\\');

        if(state.getIncorrectGuesses()<5){return;}
        screen.get(2).set(3,'\\');

        if(state.getIncorrectGuesses()<6){return;}
        screen.get(2).set(5,'/');
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
