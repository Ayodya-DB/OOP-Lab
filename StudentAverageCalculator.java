public class StudentAverageCalculator {
    // Private attributes (Part A)
    private int totalMarks;
    private int numberOfStudents;

    // Constructor to initialize values
    public StudentAverageCalculator(int totalMarks, int numberOfStudents) {
        this.totalMarks = totalMarks;
        this.numberOfStudents = numberOfStudents;
    }

    // Method to calculate average (throws exception if numberOfStudents is 0)
    public int calculateAverage() {
        return totalMarks / numberOfStudents; // Integer division
    }
}