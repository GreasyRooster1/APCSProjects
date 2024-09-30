public class Main {
    public static void main(String[] args) {
        Integer intWrapper = new Integer(69);//create new instance of Integer
        int intValue = intWrapper.intValue(); //unboxing and using intValue()
        Double doubleWrapper = new Double(69.69); //create new instance of Double
        double doubleValue = doubleWrapper.doubleValue(); //unboxing and using doubleValue()
        System.out.println(intWrapper); //autoboxing
        System.out.println(doubleWrapper); //autoboxing
        }
}