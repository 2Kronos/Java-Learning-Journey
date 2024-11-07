package fisa;

import java.util.Random;
import java.util.Arrays;
public class LastYearT2Q3 {
	   // Generic method to find the minimum element recursively
    public static <T extends Comparable<T>> T recursiveMinimum(T[] array, int index) {
        // Base case: If we're at the last element, return it
        if (index == array.length - 1) {
            return array[index];
        }

        // Recursive case: Find the minimum in the rest of the array
        T minInRest = recursiveMinimum(array, index + 1);

        // Compare the current element with the minimum from the rest of the array
        if (array[index].compareTo(minInRest) < 0) {
            return array[index]; // current element is smaller
        } else {
            return minInRest; // minimum from the rest of the array is smaller
        }
    }

    public static void main(String[] args) {
        // Generate a 10-element random double array between 1.0 and 49.0
        Random random = new Random();
        Double[] randomArray = new Double[10];

        // Populate the array with random doubles
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = 1.0 + (49.0 - 1.0) * random.nextDouble(); // Generates doubles between 1.0 and 49.0
        }

        // Display the generated array
        System.out.println("Generated Array: " + Arrays.toString(randomArray));

        // Find the smallest element using the recursiveMinimum method
        Double minElement = recursiveMinimum(randomArray, 0);

        // Display the smallest element
        System.out.println("Smallest element: " + minElement);
    }

}
