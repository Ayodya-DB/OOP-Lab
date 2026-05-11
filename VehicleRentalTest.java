public class VehicleRentalTest {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Car("CAR123", "Toyota", 5, 2000);
        Vehicle vehicle2 = new Bike("BIKE456", "Honda", 10, 100);

        System.out.println("Car Info:");
        vehicle1.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle1.calculateRentalCost());

        System.out.println("\nBike Info:");
        vehicle2.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle2.calculateRentalCost());
    }
}