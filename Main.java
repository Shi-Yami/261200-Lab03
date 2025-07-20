public class Main {
    public static void main(String[] args) {
        Patient somchai = new Patient(101, "Shi", 2006, 185.5, 78.5, "O", "090-123-4567");
        somchai.displayDetails(2025);

        int currentYear = 2024;

        // Test valid patient with full constructor
        Patient validPt = new Patient(1001, "John Doe", 1978, 175.5, 78.0, "A", "123-456-7890");
        validPt.displayDetails(currentYear);

        // Test invalid values, use default blood/phone
        Patient invalidPt = new Patient(1002, "Joe Dohn", 1990, -160.0, -65.0);
        invalidPt.displayDetails(currentYear);
    }
}
