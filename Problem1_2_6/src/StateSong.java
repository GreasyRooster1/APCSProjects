public class StateSong {
    public static void main(String[] args) {
        String line1 = "I love you, California, you’re the greatest state of all.\n";
        String line2 = new String("I love you in the winter, summer, spring and in the fall.\n");

        //this ye'ol string is immutable
        String line3 = "I love your fertile valleys; your dear mountains I adore.\n";

        int yearWritten = 1913;

        String finalString = line1 + line2 + line3;
        finalString += "\n this \"song\" was written in "+ yearWritten;

        System.out.println(finalString);
    }
}