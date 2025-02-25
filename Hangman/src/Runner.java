import java.util.Scanner;

public class Runner {
    public static final String chars = "qwertyuiopasdfghjklzxcvbnm";
    public void run(GameState state){
        char guess = getInput();
        state.getGuesses().add(guess);
        if(state.getCorrectWord().contains(guess+"")){
            checkPhrase(state,guess);
        }else{
            state.setIncorrectGuesses(state.getIncorrectGuesses()+1);
            if(state.getIncorrectGuesses()==6){
                state.setLoss(true);
            }
        }
    }

    public void checkPhrase(GameState state,char guess){
        String puzzle = state.getCurrentPuzzle();
        for(int i=0;i<state.getCorrectWord().length();i++){
            if(state.getCorrectWord().charAt(i) == guess){
                puzzle= puzzle.substring(0,i)+state.getCorrectWord().charAt(i)+puzzle.substring(i+1);
            }
        }
        if(puzzle.equals(state.getCorrectWord())){
            state.setWon(true);
        }
        state.setCurrentPuzzle(puzzle);
    }

    public char getInput(){
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String guess = scanner.nextLine().toLowerCase();
            char character = guess.charAt(0);
            if (chars.contains(character + "")) {
                return character;
            }
        }
    }
}
