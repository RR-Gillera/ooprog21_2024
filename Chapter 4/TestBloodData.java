import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        // Create two BloodData objects
        BloodData defaultBlood = new BloodData();  // Default constructor
        BloodData userBlood = new BloodData();     // Default constructor (initially)

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for blood type and Rh factor
        System.out.print("Enter your blood type (A, B, AB, O): ");
        String bloodType = scanner.nextLine();

        System.out.print("Enter your Rh factor (+ or -): ");
        String rhFactor = scanner.nextLine();

        // Create the userBlood object with user's input values
        userBlood = new BloodData(bloodType, rhFactor);

        // Display the details of both objects
        System.out.println("\nDetails of Default Blood Data Object:");
        System.out.println("Blood Type: " + defaultBlood.getBloodType() + " " + defaultBlood.getRhFactor());

        System.out.println("\nDetails of User's Blood Data Object:");
        System.out.println("Blood Type: " + userBlood.getBloodType() + " " + userBlood.getRhFactor());

        // Update defaultBlood object with user's input
        defaultBlood.setBloodType(bloodType);
        defaultBlood.setRhFactor(rhFactor);

        // Display the details of the defaultBlood object again to confirm changes
        System.out.println("\nUpdated Details of Default Blood Data Object:");
        System.out.println("Blood Type: " + defaultBlood.getBloodType() + " " + defaultBlood.getRhFactor());

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
