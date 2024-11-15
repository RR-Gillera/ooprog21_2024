import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = s.nextLine();

        if (isPalindrome(input)) {
            System.out.println("This is a palindrome.");
        } else {
            System.out.println("This is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        StringBuilder builder = new StringBuilder();

        String palindrome = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        builder.append(palindrome);
        String reversed = builder.reverse().toString();
        return palindrome.equals(reversed);
    }
}
