import java.util.Scanner;
public class Billing {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

      System.out.print("Enter the price: ");
      double price = s.nextDouble();

      System.out.print("Enter the quantity: ");
      int quantity = s.nextInt();

      System.out.print("Enter the discount value: ");
      int discount = s.nextInt();

      if(discount > 0){
         computeBill(price, quantity, discount);
      } else {
         computeBill(price, quantity);
      }
   }

   public static void computeBill(double price) {
      double total = price * 1.08; // 1.08 so that the tax value will be automatically added in the total price.
      System.out.println("The total price for the bill is: " + total);
   }

   public static void computeBill(double price, int quantity) {
      double total = price * quantity * 1.08;
      System.out.println("The total price for the bill is: " + total);
   }

   public static void computeBill(double price, int quantity, int discount) {
      double total = price * quantity * 1.08;
      double disctotal = (100.0 - discount) / 100;// here i used this formula so that we can extract the difference of the discount % from 100% then divided by 100 to get the decimal value of the percent form.

      total *= disctotal;

      System.out.println("The total price for the bill is: " + total);

   }

}