
import java.util.ArrayList;

public class GameState {
    private ArrayList<Character> guesses = new ArrayList<>();
    private String correctWord = "";

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
}
