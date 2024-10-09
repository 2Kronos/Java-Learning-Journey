//  Write a Java program that reads a sentence from the user and counts the number of vowels (a, e, i, o, u) in the sentence. Ignore case when counting.
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison
        int vowelCount = 0;

        for (char c : sentence.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        scanner.close();
    }
}
