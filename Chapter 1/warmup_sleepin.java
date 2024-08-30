import java.util.Scanner;

public class warmup_sleepin {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        
        System.out.print("Enter 'true' if weekday and 'false' if not: ");
        String weekdayInput = s.nextLine();
        boolean weekday = Boolean.parseBoolean(weekdayInput);
        
        System.out.print("Enter 'true' if in vacation, 'false' if not: ");
        String vacationInput = s.nextLine();
        boolean vacation = Boolean.parseBoolean(vacationInput);
        
        System.out.println("Can you sleep in?: " + sleepIn(weekday, vacation));
        
        
        s.close();
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
