import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RecursiveLinearSearch {

    // Recursive linear search method
    public static int recursiveLinearSearch(int[] array, int searchElement, int currentIndex) {
        // Base case: if currentIndex is out of bounds, return -1 (element not found)
        if (currentIndex >= array.length) {
            return -1;
        }

        // Check if the current element is the one we are looking for
        if (array[currentIndex] == searchElement) {
            return currentIndex;  // Return the index if element is found
        }

        // Continue searching in the rest of the array
        return recursiveLinearSearch(array, searchElement, currentIndex + 1);
    }

    public static void main(String[] args) {
        // Generate a random integer array with elements in the range 1 to 19
        Random rand = new Random();
        int[] randomArray = new int[10];  // Array with 10 elements

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(19) + 1;  // Random integers between 1 and 19
        }

        // Display the generated array
        System.out.println("Generated array: " + Arrays.toString(randomArray));

        // Create a scanner to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter an integer to search for
        System.out.print("Enter an integer to search for: ");
        int searchElement = input.nextInt();

        // Perform recursive linear search
        int result = recursiveLinearSearch(randomArray, searchElement, 0);

        // Display the search result
        if (result == -1) {
            System.out.println(searchElement + " was not found in the array.");
        } else {
            System.out.println(searchElement + " was found at index " + result + " in the array.");
        }

        // Close scanner
        input.close();
    }
}
