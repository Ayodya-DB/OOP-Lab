public class LabAssistant extends StaffMember {
    private int hoursWorked;
    private double hourlyRate;

    public LabAssistant(String fullName, String staffId, String department, int hoursWorked, double hourlyRate) {
        super(fullName, staffId, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateMonthlyPayment() {
        return hoursWorked * hourlyRate;
    }

    public void displayLabAssistantDetails() {
        displayBasicDetails();
        System.out.println("Role: Lab Assistant");
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
    }
}
