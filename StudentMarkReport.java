public class StudentMarkReport {
    // Private array attribute (Part A)
    private String[] marks;

    // Constructor
    public StudentMarkReport(String[] marks) {
        this.marks = marks;
    }

    // Method to get mark at specific index
    public int getMarkAt(int index) {
        String selectedMark = marks[index]; // Can throw ArrayIndexOutOfBoundsException
        return Integer.parseInt(selectedMark); // Can throw NumberFormatException
    }
}