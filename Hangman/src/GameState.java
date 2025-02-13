
import java.util.ArrayList;

public class GameState {
    private ArrayList<Character> guesses = new ArrayList<>();
    private String correctWord = "";
    private boolean running = false;
    private String[] words = {"teo","lucas","french","code","jazz","chatgpt","github","java","stick","bundle"};

    public void setup() {
        correctWord = words[(int)(Math.random()* words.length)];
    }

    public ArrayList<Character> getGuesses() {
        return guesses;
    }

    public void setGuesses(ArrayList<Character> guesses) {
        this.guesses = guesses;
    }

    public String getCorrectWord() {
        return correctWord;
    }

    public void setCorrectWord(String correctWord) {
        this.correctWord = correctWord;
    }

    public boolean isRunning() {
        return running;
    }
    public void setRunning(boolean running) {
        this.running = running;
    }
}
