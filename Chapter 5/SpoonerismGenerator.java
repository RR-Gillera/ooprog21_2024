import java.util.Scanner;

public class SpoonerismGenerator {
    
    private static String getWord(String prompt) {
        Scanner s = new Scanner(System.in);
        System.out.print(prompt);
        return s.next();
    }

    public static void run(String word1, String word2) {

        int vowelIndex1 = vowelIndex(word1);
        int vowelIndex2 = vowelIndex(word2);
        
        if (vowelIndex1 <= 0 || vowelIndex2 <= 0) {
            System.out.println(word1 + " and " + word2 + " cannot be spoonerized.");
            return;
        }

        String newWord1 = word2.substring(0, vowelIndex2) + word1.substring(vowelIndex1);
        String newWord2 = word1.substring(0, vowelIndex1) + word2.substring(vowelIndex2);

        System.out.println(word1 + " and " + word2 + " spoonerized are " + newWord1 + " " + newWord2);
    }

    private static int vowelIndex(String word) {
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String word1 = getWord("Enter the first word: ");
        String word2 = getWord("Enter the second word: ");

        run(word1, word2);

    }
}
