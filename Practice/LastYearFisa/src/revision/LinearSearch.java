package revision;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
    // Recursive method to perform linear search
    public static int recursiveLinearSearch(int[] array, int target, int index) {
        // Base case: if we reach the end of the array and haven't found the target
        if (index >= array.length) {
            return -1; // Return -1 if the target is not found
        }
        
        // Check if the current element matches the target
        if (array[index] == target) {
            return index; // Return the index if we found the target
        }
        
        // Recursive call: move to the next index
        return recursiveLinearSearch(array, target, index + 1);
    }

    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();
        
        // Generate an array of 10 random integers in the range of 1 to 19
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(19) + 1;
        }

        // Display the generated array
        System.out.print("Generated Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Ask the user for the target number to search for
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to search for: ");
        int target = scanner.nextInt();
        
        // Perform the recursive linear search
        int result = recursiveLinearSearch(array, target, 0);
        
        // Display the result
        if (result == -1) {
            System.out.println("The element " + target + " was not found in the array.");
        } else {
            System.out.println("The element " + target + " was found at index " + result + ".");
        }
        
        // Close the scanner
        scanner.close();
    }
}
