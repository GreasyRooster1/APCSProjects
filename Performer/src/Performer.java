/** Performer class based on AP CS A daily videos for 9.1 */
public class Performer {
    private String name;
    private int age;
    private String hometown;
    private String agent;

    public Performer(){
        name="Robby Heilghsborogh";
        age=16;
    }

    public Performer(String _name, int _age){
        name=_name;
        age=_age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHometown() {
        return hometown;
    }

    public String getAgent() {
        return agent;
    }

    public void practice(){
        System.out.println("Practicing");
    }

    public void perform(){
        System.out.println("Performing");
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Hometown: " + hometown + ", Agent: " + agent;
    }
}
