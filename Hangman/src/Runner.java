import java.util.Scanner;

public class Runner {
    public static final String chars = "qwertyuiopasdfghjklzxcvbnm";
    public void run(GameState state){
        char guess = getInput();

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
