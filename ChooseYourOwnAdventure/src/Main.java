import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        type("Press enter to start",true);
        scanner.nextLine();


        type("What is your name: ",false);
        sleep(1500);
        type("\nactually, i dont care",true);
        type("lets just start this game",true);

        String os = getInput("You are a new programmer learning to code\n" +
                "you need to choose an operating system to use for the rest of your life\n" +
                "which operating system are you going to choose","windows","macos","arch","templeos");

        if(os.equals("windows")){
            type("wow, you chose the most basic of the options",true);
            type("have fun updating your operating system twice every week for the rest of your life",true);
            type("ok well that is an ok choice i guess",true);
        }

        if(os.equals("macos")){
            type("this is looking great, MacOS is the best operating system ever",true);
            type("you absolutely love Apple, they are your favorite company ever",true);
            type("Apple never does anything wrong ever! Their products are priced great and you buy everything from them",true);
            type("you despise androids and know that IPhones are clearly better",true);
        }
        if(os.equals("arch")){
            type("you will spend the rest of your days saying \"i use arch btw\"",true);
            type("most of your time programming will be spent fixing and configuring your os",true);
            type("you will never be able to play any quality video games either",true);
        }
        if(os.equals("templeos")){
            type("you have a connection with god",true);
            type("that's all i have to say",true);
            type("this is many times better than any of the other choices",true);
        }

        String language = "";
        if(os.equals("templeos")) {
            language = getInput("what is going to be your programing language of choice?", "holy c", "asm");
        }else{
            language = getInput("what is going to be your programing language of choice?","c","javascript","rust","asm","brain fudge","swift");
        }

        String workplace = "";
        if(os.equals("macos")) {
            type("usually programmers choose where they work, but you are already destined to work at the best company ever, Apple!",true);
            workplace="apple";
        }else{
            workplace = getInput("where do you want to work?","microsoft","google","apple","tuhsd","indie");
        }


    }

    public static void sleep(long millis){
        try {
            // to sleep 10 seconds
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            // recommended because catching InterruptedException clears interrupt flag
            Thread.currentThread().interrupt();
            // you probably want to quit if the thread is interrupted
            return;
        }
    }

    public static void type(String text,boolean line){
        for(char c : text.toCharArray()){
            System.out.print(c);
            sleep(50);
            System.out.flush();
        }
        if(line) {
            System.out.println();
        }
    }

    public static String getInput(String prompt, String... options){
        Scanner scanner = new Scanner(System.in);
        boolean badInput = true;
        String choice = "";
        StringBuilder fullPrompt = new StringBuilder(prompt + " (");
        for(String option:options){
            fullPrompt.append(option);
        }
        fullPrompt.append("): ");
        while(badInput) {
            type(fullPrompt.toString(),false);
            String line = scanner.nextLine();
            for(String option:options){
                if(option.equals(line)){
                    badInput = false;
                    choice = line;
                    break;
                }
            }
        }
        return choice;
    }
}