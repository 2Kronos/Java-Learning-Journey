```java
package revsion;

import java.util.*;

import java.io.*;

import java.util.regex.*;

  

public class SentenceProcessing {

public static void main(String[] args) {

// Create a Scanner object to read user input

Scanner input = new Scanner(System.in);

  

// Ask the user to enter a sentence

System.out.println("Enter a sentence:");

String sentence = input.nextLine();

  

// Tokenize the sentence using regex to split by spaces or punctuation

String[] words = sentence.split("\\s+|\\W+"); // Split by spaces or non-word characters

  

// Initialize counters

int totalWords = 0;

int wordsStartingWithVowel = 0;

  

// Create a list to store the capitalized words

List<String> capitalizedWords = new ArrayList<>();

  

// Loop through each word, capitalize and count based on conditions

for (String word : words) {

// Skip empty strings resulting from split

if (word.isEmpty()) continue;

// Capitalize the first letter of each word

String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();

capitalizedWords.add(capitalizedWord);

  

// Count total words

totalWords++;

  

// Check if the word starts with a vowel (case insensitive)

if (word.toLowerCase().matches("^[aeiou].*")) {

wordsStartingWithVowel++;

}

}

  

// Print each word on a separate line

System.out.println("\nCapitalized Words:");

for (String word : capitalizedWords) {

System.out.println(word);

}

  

// Print the total number of words

System.out.println("\nTotal number of words: " + totalWords);

  

// Print the number of words starting with a vowel

System.out.println("Number of words starting with a vowel: " + wordsStartingWithVowel);

  

// Write the results to a text file using try-with-resources to handle file closing automatically

try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("sentence_results.txt"))) {

  

// Write capitalized words

bufferedWriter.write("Capitalized Words:\n");

for (String word : capitalizedWords) {

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

System.out.println("\nResults written to sentence_results.txt");

}

}
```

---
