import java.util.Random;
import java.util.Arrays;

public class RecursiveMinimum {

    // Recursive method to find the minimum element in an array
    public static int recursiveMinimum(int[] array, int startIndex, int endIndex) {
        // Base case: if the array has only one element
        if (startIndex == endIndex) {
            return array[startIndex];
        }

        // Recursively find the minimum element in the rest of the array
        int mid = (startIndex + endIndex) / 2;
        int leftMin = recursiveMinimum(array, startIndex, mid);
        int rightMin = recursiveMinimum(array, mid + 1, endIndex);

        // Return the smaller of the two halves
        return Math.min(leftMin, rightMin);
    }

    public static void main(String[] args) {
        // Generate a 10-element random integer array in the range 10 to 49
        Random rand = new Random();
        int[] randomArray = new int[10];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(40) + 10;  // Random numbers between 10 and 49
        }

        // Display the generated array
        System.out.println("Generated array: " + Arrays.toString(randomArray));

        // Find the minimum element using the recursiveMinimum method
        int minElement = recursiveMinimum(randomArray, 0, randomArray.length - 1);

        // Display the smallest element of the array
        System.out.println("Smallest element in the array: " + minElement);
    }
}
