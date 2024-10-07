import java.util.Scanner;

public class Main {
    //stories using brackets for the questions
    public static String[] stories = {
            "I went to the animal {0}, the {1} and the {2} beasts were there.",
            "Once upon a time in a {0} land, a {1} {2} grew.",
            """
            wow im programming in {0}. This language is so {1}. Programming makes
            me super {2}. I use {3} btw, and i love spending {4} hours every day fixing random stuff.
            i use {5} to write code, because using a mouse is overrated. im such a {6} programmer.
            ive always wanted to make a {7} in {8} using {9}. anyways, im going to get back to
            drinking my {10} latte and debugging with stack overflow, {11}"""};

    //list of the questions that the stories use
    public static String[][] questionWords = {
            {"noun","plural noun","number"},
            {"adjective","noun","adverb"},
            {"Programming Language", "adjective", "negative feeling", "linux distro", "number", "code editor", "adjective", "programming project", "programming language", "sci-fi technology", "type of milk", "customary programmer goodbye"}
    };

    public static void main(String[] args) {
        //setup scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("pick a story 0,1,2 (2 is the only good one): ");
        int storyIndex = scanner.nextInt();
        //make sure scanner moves lines
        scanner.nextLine();

        String outputStory = stories[storyIndex];

        for (int i = 0; i < questionWords[storyIndex].length; i++) {
            //get current question in current story
            String question = questionWords[storyIndex][i];

            int identifierStart = outputStory.indexOf("{");
            int identifierEnd = outputStory.indexOf("}");
            //get the brackets and number of this question
            String identifier = outputStory.substring(identifierStart, identifierEnd+1);

            //get user input
            System.out.print("Pick a "+question+": ");
            String pick = scanner.nextLine();

            //put input back into the story
            outputStory = outputStory.replace(identifier, pick);
        }

        //output story
        System.out.println(outputStory);
    }
}