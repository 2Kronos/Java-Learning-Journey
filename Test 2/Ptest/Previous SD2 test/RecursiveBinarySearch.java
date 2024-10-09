import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RecursiveBinarySearch {

    // Recursive binary search method
    public static int binarySearch(int[] array, int searchElement, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if searchElement is at mid
            if (array[mid] == searchElement) {
                return mid;
            }

            // If searchElement is smaller, search in the lower half
            if (searchElement < array[mid]) {
                return binarySearch(array, searchElement, low, mid - 1);
            }

            // Otherwise, search in the upper half
            return binarySearch(array, searchElement, mid + 1, high);
        }

        // Element not found
        return -1;
    }

    public static void main(String[] args) {
        // Generate a 10-element random integer array in the range 10 to 49
        Random rand = new Random();
        int[] randomArray = new int[10];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(40) + 10; // Random number between 10 and 49
        }

        // Sort the array to apply binary search
        Arrays.sort(randomArray);

        // Display the generated sorted array
        System.out.println("Generated sorted array: " + Arrays.toString(randomArray));

        // Take user input for the integer to search for
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to search for: ");
        int searchElement = input.nextInt();

        // Perform binary search
        int result = binarySearch(randomArray, searchElement, 0, randomArray.length - 1);

        // Display search result
        if (result == -1) {
            System.out.println(searchElement + " was not found in the array.");
        } else {
            System.out.println(searchElement + " was found at index " + result + " in the array.");
        }

        // Close scanner
        input.close();
    }
}
