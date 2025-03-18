class Musician extends Performer {
    private String instrument;

    public Musician(String _instrument) {
        super();
        instrument=_instrument;
    }
    public Musician() {
        super();
        instrument="triangle";
    }

    public String getInstrument() {
        return instrument;
    }

    public void playInstrument() {
        System.out.println("Playing music");
    }

}