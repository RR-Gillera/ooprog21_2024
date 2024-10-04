import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BloodData bd = new BloodData();

        System.out.print("Enter Blood Type: ");
        String bloodType = s.nextLine();
        bd.setBloodType(bloodType);

        System.out.print("Enter Rh Factor: ");
        String rhFactor = s.nextLine();
        bd.setRhFactor(rhFactor);

        bd.displayBloodInfo();
    }
}
