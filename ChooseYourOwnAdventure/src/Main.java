import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int score = 0;

        //wait for enter to begin
        Scanner scanner = new Scanner(System.in);
        type("Press enter to start",true);
        scanner.nextLine();


        //ask name then continue
        type("What is your name: ",false);
        sleep(1500);
        type("\nactually, i dont care",true);
        type("lets just start this game",true);

        //initial prompt
        String os = getInput("You are a new programmer learning to code\n" +
                "you need to choose an operating system to use for the rest of your life\n" +
                "which operating system are you going to choose","windows","macos","arch","templeos");

        //windows gives good score
        if(os.equals("windows")){
            type("wow, you chose the most basic of the options",true);
            type("have fun updating your operating system twice every week for the rest of your life",true);
            type("ok well that is an ok choice i guess",true);
            score+=20;
        }

        //macos is best score
        if(os.equals("macos")){
            type("this is looking great, MacOS is the best operating system ever",true);
            type("you absolutely love Apple, they are your favorite company ever",true);
            type("Apple never does anything wrong ever! Their products are priced great and you buy everything from them",true);
            type("you despise androids and know that IPhones are clearly better",true);
            score+=25;
        }
        //arch is worst score
        if(os.equals("arch")){
            type("you will spend the rest of your days saying \"i use arch btw\"",true);
            type("most of your time programming will be spent fixing and configuring your os",true);
            type("you will never be able to play any quality video games ever! SO fun!!!",true);
            score+=10;
        }

        //temple os is special case
        if(os.equals("templeos")){
            type("you have a connection with god",true);
            type("you clearly picked the best option",true);
            type("you have a bookcase full of bibles",true);
            score+=1000;
        }

        String language = "";
        //temple os doenst get many options for language
        if(os.equals("templeos")) {
            language = getInput("what is going to be your programing language of choice?", "holy c", "asm");
        }else{
            //everyone else gets choices
            language = getInput("what is going to be your programing language of choice?","c","javascript","rust","asm","brain fudge","swift");
        }

        String workplace = "";
        //macos just goes to apple
        if(os.equals("macos")) {
            type("usually programmers choose where they work, but you are already destined to work at the best company ever, Apple!",true);
            workplace="apple";
        }else{
            //everyone gets to pick
            workplace = getInput("where do you want to work?","microsoft","google","apple","tuhsd","indie");
        }

        //temple os doenst get to pick a job
        if(os.equals("templeos")) {
            type("you dont need a job when you have a connection with god!",true);
        }else {
            //microsoft likes c,asm, rust
            //js is ok
            //everything else is bad
            if (workplace.equals("microsoft")) {
                if (language.equals("c") || language.equals("asm") || language.equals("rust")) {
                    if (language.equals("asm") || os.equals("windows")) {
                        type("you are a senior developer at microsoft", true);
                        score += 50;
                    } else {
                        type("you are a junior developer at microsoft", true);
                        score += 30;
                    }
                    type("you have been assigned to work on the new windows 12 operating system!", true);
                    type("this will be the newest os from microsoft!", true);
                    type("everyone who doenst meet the 16gb ram and rtx 3090 system requirements will not be able to upgrade!", true);
                    type("to further convince people to upgrade microsoft is ending life for windows 11 immediately after windows 12 releases", true);

                } else if (language.equals("javascript")) {
                    type("you work on making the front end for github.com more modern!", true);
                    type("the design team has decided that dark mode will be permanently remove from the site", true);
                    type("they also made you remove the search feature and replace it with a new AI search! SO innovative!!!", true);
                    score += 20;
                } else {
                    type("you have made some horrible decisions", true);
                    type("microsoft fired you after they found out you only know " + language, true);
                    type("you decided to stop programming and work at Mc Donalds", true);
                    score -= 10;
                }
                //google likes js
                //rust and c is ok
                // everythig else is bad
            } else if (workplace.equals("google")) {
                String milk = getInput("what is your favorite type of milk?", "almond", "soy", "cashew", "walnut");
                if (language.equals("javascript")) {
                    type("you are working on a new office program for the google suite!", true);
                    type("you make little contributions as there are for some reason thousands of people working on the small app", true);
                    type("between that and the large breaks you have to get your $14.95 "+milk+" milk latte, you really barely help at all", true);
                    type("the app is supposed to help businesses use gemini, and is going to be SUPER USEFUL!!!", true);
                    score += 40;
                } else if (language.equals("rust") || language.equals("c")) {
                    type("you are fixing the backend for google cloud", true);
                    type("you are very good a coding but this is literally an impossible task", true);
                    type("its hard for you to do anything as the system is so large and complex", true);
                    type("you just drink your $14.95 "+milk+"lattes everyday",true);
                    type("you barely do any work, but nobody notices as thousands of other people are working on the same thing", true);
                    score += 30;
                } else {
                    type("you have made some horrible choices", true);
                    type("google fired you after they found out you only know " + language, true);
                    type("google never uses that language it its useless", true);
                    type("you end up as a line cook in burger king", true);
                    score -= 20;
                }
                //apple likes swift
                //c and rust are ok
                //everything else is bad
            } else if (workplace.equals("apple")) {
                type("you decide to work at apple", true);

                //not picking macos loses you score
                if (!os.equals("macos")) {
                    type("you picked " + os + " as your os of choice, but thats useless here at apple, you switch to macos", true);
                    score -= 10;
                }
                type("good job at getting a job at the most ethical and morally correct company of all time!", true);
                if (language.equals("swift")) {
                    type("you picked the best language for working at apple, swift", true);
                    score += 20;
                    //using swift on macos to begin is lots of score
                    if (os.equals("macos")) {
                        type("you become a senior executive developer at apple and are making tons of money super ethically", true);
                        score += 50;
                    } else {
                        //just using swift is good
                        type("you become a senior developer at apple", true);
                        type("you are super successful!", true);
                        score += 30;
                    }
                } else if (language.equals("c") || language.equals("rust")) {
                    type("you are working on the new ios update, iOS 19", true);
                    type("you are tasked with adding new data collection features", true);
                    type("everyones data is collected and sold to China!", true);
                    type("this update will also come with new AI features", true);
                    type("this is the default iOS version for the iPhone 17, starting at $1900", true);
                    score += 40;
                } else if (language.equals("javascript")) {
                    type("you are replaceable", true);
                    type("everyone does javascript, its easy and there are thousands of js developers at apple", true);
                    score += 10;
                } else {
                    type("you are literally useless to apple, they tell you to learn a better language and buy an iPhone if you want to ever have a chance of applying again", true);
                    score -= 10;
                }
                //you just lose score
                //c rust and asm are bad
                // js is ok
                //everything else is bad
            } else if (workplace.equals("tuhsd")) {
                score -= 20;
                if (language.equals("c") || language.equals("rust") || language.equals("asm")) {
                    type("you cant work here with these skills", true);
                    type(language + " is too complicated for the students", true);
                    type("of course APCS classes dont teach us anything useful like this language", true);
                    score += 10;
                } else if (language.equals("javascript")) {
                    type("you can work as a cs 1/2, 3/4, or 5/6 teacher!", true);
                    type("as javascript is super beginner friendly and extremely easy, its one of the few languages the students can learn!", true);
                    score += 10;
                } else if (language.equals("brain fudge")) {
                    type("with your brain fudge knowledge you will be perfect at teaching APCSP", true);
                    type("this language makes much more sense than the language for the AP exam", true);
                    score += 20;
                } else {
                    type("this language will never be taught anywhere", true);
                    type("nobody likes swift", true);
                    type("you get fired and the school abolishes the computer programming department as swift has cause such a revolt with the CS students", true);
                    score -= 20;
                }
                //you just are bad
            } else if (workplace.equals("indie")) {
                type("it doesnt matter what language you picked", true);
                type("you make little to no money as there are thousands of people doing the same", true);
                type("after years of making nothing and living in your moms basement you decided to finally give up and just work at wendys", true);
                score -= 10;
            }
        }

        type("you really have made it far!",true);
        type("your final score was "+score,true);

        //show score
        if(score<20){
            type("less than 20 score?? wow you really shouldnt become a programmer",true);
        }else if(score<30){
            type("you probably should chose another career path, as you chose some bad decisions",true);
        } else if (score<50) {
            type("eh, you did alright",true);
        }else if(score<65){
            type("nice job, you could be a programmer",true);
        } else if (score<95) {
            type("you are a great programmer!",true);
        } else if (score==95) {
            type("you are the best programmer ever!",true);
        }else if(score>1000){
            type("who cares how well you did, you have a connection with god!",true);
        }
    }

    //pause execution
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

    //type text out with delay
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

    // get input with selected options
    public static String getInput(String prompt, String... options){
        Scanner scanner = new Scanner(System.in);
        boolean badInput = true;
        String choice = "";
        StringBuilder fullPrompt = new StringBuilder(prompt + " (");
        for(String option:options){
            fullPrompt.append(option).append(",");
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