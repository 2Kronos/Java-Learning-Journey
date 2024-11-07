package fisa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LastYearTest2Q2 {
	
	// Recursive binary search method
    public static int binarySearch(int[] array, int left, int right, int target) {
        // Base case: if the range is invalid, return -1 (element not found)
        if (left > right) {
            return -1;
        }

        // Find the middle index
        int middle = left + (right - left) / 2;

        // If the target is at the middle, return the index
        if (array[middle] == target) {
            return middle;
        }
        
        // If the target is smaller than the middle element, search in the left half
        if (array[middle] > target) {
            return binarySearch(array, left, middle - 1, target);
        }
        
        // Otherwise, search in the right half
        return binarySearch(array, middle + 1, right, target);
    }

    public static void main(String[] args) {
        // Generate a 10-element array with random integers between 10 and 49
        Random random = new Random();
        int[] randomArray = new int[10];

        // Populate the array with random integers
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(40) + 10; // Generates integers from 10 to 49
        }

        // Sort the array to ensure it's in ascending order for binary search
        Arrays.sort(randomArray);

        // Display the generated sorted array
        System.out.println("Generated Sorted Array: " + Arrays.toString(randomArray));

        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter an integer to search for
        System.out.print("Enter an integer to search for: ");
        int target = scanner.nextInt();

        // Perform the recursive binary search
        int result = binarySearch(randomArray, 0, randomArray.length - 1, target);

        // Display the result of the search
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }

}
