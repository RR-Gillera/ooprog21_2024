import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Patient patient1 = new Patient();
        
        System.out.print("Enter ID number for Patient 2: ");
        int id2 = scanner.nextInt();
        System.out.print("Enter age for Patient 2: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();  // Clear the buffer
        System.out.print("Enter blood type for Patient 2: ");
        String bloodType2 = scanner.nextLine();
        System.out.print("Enter Rh factor for Patient 2: ");
        String rhFactor2 = scanner.nextLine();
        Patient patient2 = new Patient(id2, age2, bloodType2, rhFactor2);

        System.out.print("Enter ID number for Patient 3: ");
        int id3 = scanner.nextInt();
        System.out.print("Enter age for Patient 3: ");
        int age3 = scanner.nextInt();
        Patient patient3 = new Patient(id3, age3, "O", "+");

        System.out.println("\nPatient 1 details:");
        System.out.println("ID: " + patient1.getIdNumber() + ", Age: " + patient1.getAge() + ", Blood Type: " + patient1.getBloodData().getBloodType() + " " + patient1.getBloodData().getRhFactor());
        
        System.out.println("\nPatient 2 details:");
        System.out.println("ID: " + patient2.getIdNumber() + ", Age: " + patient2.getAge() + ", Blood Type: " + patient2.getBloodData().getBloodType() + " " + patient2.getBloodData().getRhFactor());

        System.out.println("\nPatient 3 details:");
        System.out.println("ID: " + patient3.getIdNumber() + ", Age: " + patient3.getAge() + ", Blood Type: " + patient3.getBloodData().getBloodType() + " " + patient3.getBloodData().getRhFactor());

    }
}
