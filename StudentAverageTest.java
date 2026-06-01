public class StudentAverageTest {
    public static void main(String[] args) {
        // Create an object with 0 students to trigger an error
        StudentAverageCalculator calculator = new StudentAverageCalculator(500, 0);

        try {
            int average = calculator.calculateAverage();
            System.out.println("Average: " + average);
        } 
        catch (ArithmeticException e) {
            // Part C: Comment explaining why the exception occurs
            // Exception occurs because dividing an integer by zero is mathematically undefined in Java.
            System.out.println("Error: Number of students cannot be zero.");
        } 
        finally {
            System.out.println("Average calculation completed.");
        }

        System.out.println("Program continues...");
    }
}