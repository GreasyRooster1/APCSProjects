class BalletDancer extends Dancer {
    private Object balletShoes;

    // ?????
    BalletDancer(Object balletShoes){
        super();
        this.balletShoes = balletShoes;
    }

    public void jete(){
        System.out.println("Performing a jete");
    }
    public void priouette(){
        System.out.println("Performing a pirouette");
    }
}