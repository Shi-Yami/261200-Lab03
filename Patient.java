public class Patient {
    private int Id;
    private String name;
    private int birthYear;
    private double height; // in cm
    private double weight; // in kg
    private String bloodGroup;
    private String phoneNumber;

    // Original constructor
    public Patient(int id, String name, int birthYear, double height, double weight) {
        this(id, name, birthYear, height, weight, "Unknown", "Unknown");
    }

    // New constructor with blood group and phone number (constructor chaining)
    public Patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber) {
        this.Id = id;
        this.name = name;

        if (birthYear < 2025)
            this.birthYear = birthYear;
        else
            this.birthYear = 2000;

        if (height >= 30 && height <= 210)
            this.height = height;
        else
            this.height = 170;

        if (weight >= 2 && weight <= 150)
            this.weight = weight;
        else
            this.weight = 80;

        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
    }

    // Existing getters
    public int getId() { return this.Id; }
    public String getName() { return this.name; }
    public int getBirthYear() { return this.birthYear; }
    public double getHeight() { return this.height; }
    public double getWeight() { return this.weight; }

    // New getters
    public String getBloodGroup() { return this.bloodGroup; }
    public String getPhoneNumber() { return this.phoneNumber; }

    // BMI method
    public double getBMI() {
        double heightInMeters = this.height / 100.0;
        return this.weight / (heightInMeters * heightInMeters);
    }

    public int getAge(int currentYear) {
        if (currentYear >= birthYear)
            return currentYear - birthYear;
        return 0;
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + this.name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + this.height);
        System.out.println("Patient Weight (kg): " + this.weight);
        System.out.println("Blood Group: " + this.bloodGroup);
        System.out.println("Phone Number: " + this.phoneNumber);
        System.out.printf("Patient BMI: %.2f%n", getBMI());
    }
}
