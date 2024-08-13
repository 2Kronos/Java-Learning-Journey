import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelWordsProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        
        // Tokenize the sentence
        String[] words = sentence.split(" ");
        
        // Regular expression to identify words starting with a vowel
        Pattern pattern = Pattern.compile("\\b[AEIOUaeiou][a-zA-Z]*\\b");
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("vowel_words.txt", true))) {
            for (String word : words) {
                Matcher matcher = pattern.matcher(word);
                if (matcher.find()) {
                    // Capitalize the first letter of the word
                    String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
                    
                    // Print the word
                    System.out.println(capitalizedWord);
                    
                    // Write the word to the file
                    writer.write(capitalizedWord);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        
        scanner.close();
    }
}
