class Comedian extends Performer {
    private String joke;

    public Comedian(){
        super("kevin hart",58);
        joke = "teo tanaka. get it? because hes a joke! HAhAHAHHAHAHSIAUDHOIAUN IUSOUILHPDLJGHOSudfhlsfb,xjhgfvcl jwgroeyuvcdnu 8-f";
    }

    public Comedian(String joke){
        super("kevin hart",58);
        this.joke = joke;
    }

    public void writeJokes() {
        System.out.println("Writing jokes");
    }
}