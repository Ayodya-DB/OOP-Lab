public class ProductBillTest {
    public static void main(String[] args) {
        // Passing invalid text "two" for quantity to trigger the error
        ProductBill bill = new ProductBill("1500.00", "two");

        try {
            double total = bill.calculateTotal();
            System.out.println("Total Bill: " + total);
        } 
        catch (NumberFormatException e) {
            // Part C: Comment explaining why the exception occurs
            // Exception occurs because the String "two" cannot be parsed into a valid integer.
            System.out.println("Error: Price and quantity must be valid numbers.");
        } 
        finally {
            System.out.println("Product bill calculation completed.");
        }

        System.out.println("Program continues...");
    }
}