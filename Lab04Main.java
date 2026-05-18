public class Lab04Main {
    public static void main(String[] args) {
        StaffMember.showSystemName();
        UniversityPolicy.showPolicyHeader();
        System.out.println("University Name: " + UniversityPolicy.UNIVERSITY_NAME);
        System.out.println();

        Lecturer lecturer1 = new Lecturer("Nimal Perera", "L101", "Computer Science", 3, 45000);
        Lecturer lecturer2 = new Lecturer("Saman Silva", "L102", "Information Technology", 2, 50000);
        LabAssistant labAssistant1 = new LabAssistant("Kamal Fernando", "A201", "Physics", 120, 800);

        lecturer2.changeDepartment("Software Engineering");

        lecturer1.displayLecturerDetails();
        System.out.println("Monthly Payment: " + lecturer1.calculateMonthlyPayment());
        System.out.println("Bonus: " + UniversityPolicy.calculateBonus(lecturer1.calculateMonthlyPayment()));
        lecturer1.showCommonNotice();
        System.out.println();

        lecturer2.displayLecturerDetails();
        System.out.println("Monthly Payment: " + lecturer2.calculateMonthlyPayment());
        System.out.println("Bonus: " + UniversityPolicy.calculateBonus(lecturer2.calculateMonthlyPayment()));
        lecturer2.showCommonNotice();
        System.out.println();

        labAssistant1.displayLabAssistantDetails();
        System.out.println("Monthly Payment: " + labAssistant1.calculateMonthlyPayment());
        System.out.println("Bonus: " + UniversityPolicy.calculateBonus(labAssistant1.calculateMonthlyPayment()));
        labAssistant1.showCommonNotice();
        System.out.println();

        double totalMonthlyPayment = lecturer1.calculateMonthlyPayment()
                + lecturer2.calculateMonthlyPayment()
                + labAssistant1.calculateMonthlyPayment();

        System.out.println("Total Monthly Payment: " + totalMonthlyPayment);
        System.out.println("Total Staff Objects: " + StaffMember.getStaffCount());
    }
}
