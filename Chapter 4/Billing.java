public class Billing{
   public static void main(String[] args){

      computeBill(23.2);
      computeBill(24.4, 2);
      computeBill(24.9, 3, 5);
      
   }
   public static void computeBill(double price){
      double total = price * 1.08;
      System.out.println("The total price for the bill is: " +total);
   }
   public static void computeBill(double price, int quantity){
      double total = price * quantity * 1.08;
      System.out.println("The total price for the bill is: " +total);
   }
   public static void computeBill(double price, int quantity, int discount){
      double total = price * quantity * 1.08;
      
         double disc = discount / 100.0;
         double disctotal = total * disc;
      
         total = total - disctotal;
         
      System.out.println("The total price for the bill is: " +total);
      
   }
   
}