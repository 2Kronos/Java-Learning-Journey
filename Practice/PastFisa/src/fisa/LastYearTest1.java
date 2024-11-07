package fisa;


import java.util.*;
import java.io.*;
import java.util.regex.*;
public class LastYearTest1 {
	
	
	public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a sentence
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();

        // Tokenize the sentence into words, splitting by whitespace or punctuation
        String[] words = sentence.split("\\s+|\\W+"); // Split by spaces or non-word characters

        // Initialize counters
        int totalWords = 0;
        int wordsStartingWithVowel = 0;

        // Create a list to store the capitalized words that start with a vowel
        List<String> vowelWords = new ArrayList<>();

        // Loop through each word to process it
        for (String word : words) {
            // Skip empty strings resulting from split
            if (word.isEmpty()) continue;

            // Count total words
            totalWords++;

            // Check if the word starts with a vowel (case insensitive)
            if (word.toLowerCase().matches("^[aeiou].*")) {
                // Capitalize the word and add it to the vowelWords list
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                vowelWords.add(capitalizedWord);
                wordsStartingWithVowel++;
            }
        }

        // Print the words that start with a vowel
        System.out.println("\nWords starting with a vowel:");
        for (String word : vowelWords) {
            System.out.println(word);
        }

        // Print the total number of words
        System.out.println("\nTotal number of words: " + totalWords);

        // Print the number of words starting with a vowel
        System.out.println("Number of words starting with a vowel: " + wordsStartingWithVowel);

        // Write the results to a text file using try-with-resources to handle file closing automatically
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("sentence_results.txt", true))) {
            // Write capitalized words starting with vowels
            bufferedWriter.write("Words starting with a vowel:\n");
            for (String word : vowelWords) {
                bufferedWriter.write(word + "\n");
            }

            // Write the total number of words
            bufferedWriter.write("\nTotal number of words: " + totalWords + "\n");

            // Write the number of words starting with a vowel
            bufferedWriter.write("Number of words starting with a vowel: " + wordsStartingWithVowel + "\n");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Close the scanner
        input.close();

        // Inform the user that the results have been written to the file
        System.out.println("\nResults written to sentence_results.txt");
    }

}
