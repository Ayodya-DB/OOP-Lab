public final class UniversityPolicy {
    public static final String UNIVERSITY_NAME = "University of Kelaniya";
    public static final double BONUS_RATE = 0.10;

    public static void showPolicyHeader() {
        System.out.println("University Payment Policy");
    }

    public static double calculateBonus(double monthlyPayment) {
        return monthlyPayment * BONUS_RATE;
    }
}
