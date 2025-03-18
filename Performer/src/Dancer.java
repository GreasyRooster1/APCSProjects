class Dancer extends Performer {
    private double shoeSize;

    public Dancer(double shoeSize) {
        super();
        this.shoeSize = shoeSize;
    }

    public Dancer(){
        super();
        this.shoeSize = 10.0;
    }

    public void dance() {
        System.out.println("Dancing");
    }
    public void selectMusic() {
        System.out.println("Selecting music");
    }
}