import java.util.Scanner;
public class Billing {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

      System.out.println("Enter the price: ");
      double price = s.nextDouble();

      System.out.println("Enter the price: ");
      int quantity = s.nextInt();

      System.out.println("Enter the price: ");
      int discount = s.nextInt();

      if(discount > 0){
         computeBill(price, quantity, discount);
      } else {
         computeBill(price, quantity);
      }
   }

   public static void computeBill(double price) {
      double total = price * 1.08;
      System.out.println("The total price for the bill is: " + total);
   }

   public static void computeBill(double price, int quantity) {
      double total = price * quantity * 1.08;
      System.out.println("The total price for the bill is: " + total);
   }

   public static void computeBill(double price, int quantity, int discount) {
      double total = price * quantity * 1.08;
      double disctotal = (100.0 - discount) / 100;

      total *= disctotal;

      System.out.println("The total price for the bill is: " + total);

   }

}