class Dancer extends Performer {
    private double shoeSize;

    public Dancer(double shoeSize) {
        super("robby heilghsborough",24);
        this.shoeSize = shoeSize;
    }

    public Dancer(){
        super("robby heilghsborough",24);
        this.shoeSize = 10.0;
    }

    public void dance() {
        System.out.println("Dancing");
    }
    public void selectMusic() {
        System.out.println("Selecting music");
    }
}