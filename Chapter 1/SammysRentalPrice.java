import java.util.Scanner;

public class SammysRentalPrice{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("\n\t\t\tSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("\t\t\tS  Sammy's makes it fun in the sun.  S");
        System.out.println("\t\t\tSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        System.out.print("\n\n\tEnter the minutes a piece of sports equipment was rented: ");
        int equipRent = s.nextInt();


        int hours = equipRent / 60;
        int minutes = equipRent % 60;
        int costPerHr = 40;

        int totalCost = (hours * costPerHr) + minutes;

        if(hours > 1){
            if(minutes <= 1){
                System.out.println("\n\tThe Equipment was Rented for "+ hours +" Hours and "+ minutes +" Minute.");
            } else {
                System.out.println("\n\tThe Equipment was Rented for "+ hours +" Hours and "+ minutes +" Minutes.");
            }
        } else {
            if(minutes <= 1){
                System.out.println("\n\tThe Equipment was Rented for "+ hours +" Hour and "+ minutes +" Minute.");
            } else {
                System.out.println("\n\tThe Equipment was Rented for "+ hours +" Hour and "+ minutes +" Minutes.");
            }
        }

        System.out.println("\tTotal Number of Minutes the Equipment was Rented: "+ equipRent + " Minute/s");
        System.out.println("\tThe Total Cost of The Equiment Rented is: $"+ totalCost);
        
        s.close();

    }

}