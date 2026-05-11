public class DeliveryChargeTest {
    public static void main(String[] args) {

        DeliveryChargeCalculator calc = new DeliveryChargeCalculator();

        System.out.println("Base Charge: " + calc.calculateCharge(1000));
        System.out.println("With Distance: " + calc.calculateCharge(1000, 5));
        System.out.println("With Distance & Weight: " + calc.calculateCharge(1000, 5, 2));
        System.out.println("With Express: " + calc.calculateCharge(1000, true));
    }
}