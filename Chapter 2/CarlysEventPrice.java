import java.util.Scanner;

public class CarlysEventPrice {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("\n\t\t\t***************************************");
        System.out.println("\t\t\t*  Carly's Makes the food that makes  *");
        System.out.println("\t\t\t*            it a party.              *");
        System.out.println("\t\t\t***************************************");

        System.out.print("\n\n\tEnter the number of guest attending: ");
        int guest = s.nextInt();

        int price = 35;
        int totalPrice = guest * price;
        boolean largeEvent = guest >= 50;

        System.out.println("\n\tGuest Attending: "+ guest +" Guest/s");
        System.out.println("\tPrice per Guest: $"+ price);
        System.out.println("\tTotal Price: $"+ totalPrice);
        System.out.println("\n\tIs Event Classified as Large Event?: " + largeEvent);

        s.close();
        
    }

}