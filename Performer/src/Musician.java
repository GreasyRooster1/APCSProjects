class Musician extends Performer {
    private String instrument;

    public Musician(String _instrument) {
        super("wolfgang mozart",167);
        instrument=_instrument;
    }
    public Musician() {
        super("wolfgang mozart",167);
        instrument="triangle";
    }

    public String getInstrument() {
        return instrument;
    }

    public void playInstrument() {
        System.out.println("Playing music");
    }

}