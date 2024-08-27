package chapter9;

public class TasteTester {
    public static void main(String[] args) {
        Cake birthdayCake = new BirthdayCake("Chocolate");
        Cake weddingCake = new WeddingCake("Milk Caramel");

        birthdayCake.setFlavor("Caramel");
        System.out.println("I changed the birthday cake flavor to: " + birthdayCake.getFlavor());
        ((BirthdayCake) birthdayCake).setCandles(10);
        System.out.println("My birthday cake has " + ((BirthdayCake) birthdayCake).getCandles() + " candles");
    }
}
