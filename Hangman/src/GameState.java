
import java.util.ArrayList;

public class GameState {
    private ArrayList<Character> guesses = new ArrayList<>();
    private String correctWord = "";
    private boolean running = true;
    private String[] words = {"teo","lucas","french","code","jazz","chatgpt","github","java","stick","bundle"};
    private String currentPuzzle = "";
    private int incorrectGuesses = 0;
    private boolean won = false;
    private boolean loss = false;
    public void setup() {
        correctWord = words[(int)(Math.random()* words.length)];
        for (int i = 0; i < correctWord.length(); i++) {
            currentPuzzle = currentPuzzle+"_";
        }
        System.out.println(correctWord);
        System.out.println(currentPuzzle);
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
    public String getCurrentPuzzle() {
        return currentPuzzle;
    }
    public void setCurrentPuzzle(String p) {
        currentPuzzle = p;
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

    public int getIncorrectGuesses() {
        return incorrectGuesses;
    }

    public void setIncorrectGuesses(int incorrectGuesses) {
        this.incorrectGuesses = incorrectGuesses;
    }

    public boolean isWon() {
        return won;
    }

    public void setWon(boolean won) {
        this.won = won;
    }

    public boolean isLoss() {
        return loss;
    }

    public void setLoss(boolean loss) {
        this.loss = loss;
    }
}
