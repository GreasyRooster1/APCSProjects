import java.util.Scanner;

public class Main {
    public static String[] stories = {
            "I went to the animal {0}, the {1} and the {2} beasts were there.",
            "Once upon a time in a {0} land, a {1} {2} grew.",
            """
            wow im programming in {0}. This language is so {1}. Programming makes
            me super {2}. I use {3} btw, and i love spending {4} hours every day fixing random stuff.
            i use {5} to write code, because using a mouse is overrated. im such a {6} programmer.
            ive always wanted to make a {7} in {8} using {9}. anyways, im going to get back to
            drinking my {10} latte and debugging with stack overflow, {11}"""};

    public static String[][] questionWords = {
            {"noun","plural noun","number"},
            {"adjective","noun","adverb"},
            {"Programming Language", "adjective", "negative feeling", "linux distro", "number", "code editor", "adjective", "programming project", "programming language", "sci-fi technology", "type of milk", "customary programmer goodbye"}
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("pick a story 0,1,2");
        int story = scanner.nextInt();

        String outputStory = stories[story];

        for (int i = 0; i < questionWords[story].length; i++) {
            String question = questionWords[story][i];

            int identifierStart = outputStory.indexOf("{");
            int identifierEnd = outputStory.indexOf("}");
            String identifier = outputStory.substring(identifierStart, identifierEnd+1);

            System.out.print("Pick a "+question+":");
            String pick = scanner.nextLine();

            outputStory = outputStory.replace(identifier, pick);
        }
        System.out.println(outputStory);
    }
}