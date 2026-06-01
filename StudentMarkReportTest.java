public class StudentMarkReportTest {
    public static void main(String[] args) {
        String[] marksArray = {"78", "82", "absent", "90"};
        StudentMarkReport report = new StudentMarkReport(marksArray);

        // Part B: Test an Invalid Array Index (6)
        try {
            int mark = report.getMarkAt(6);
            System.out.println("Mark at index 6: " + mark);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            // Part D: Comment explaining why index 6 fails
            // Exception occurs because index 6 is outside the bounds of the array (array size is 4).
            System.out.println("Error: Selected mark position does not exist.");
        } 
        finally {
            System.out.println("Array access checking completed.");
        }

        // Part C: Test an Invalid Number Format (index 2 contains "absent")
        try {
            int mark = report.getMarkAt(2);
            System.out.println("Mark at index 2: " + mark);
        } 
        catch (NumberFormatException e) {
            // Part D: Comment explaining why index 2 fails
            // Exception occurs because the text "absent" at index 2 cannot be parsed into an integer.
            System.out.println("Error: Selected mark is not a valid number.");
        } 
        finally {
            System.out.println("Number conversion checking completed.");
        }

        System.out.println("Report checking completed.");
    }
}