import java.util.Random;
import java.util.Arrays;

public class GenericRecursiveMinimum {

    // Generic recursive method to find the minimum element in an array
    public static <T extends Comparable<T>> T recursiveMinimum(T[] array, int startIndex, int endIndex) {
        // Base case: if the array has only one element
        if (startIndex == endIndex) {
            return array[startIndex];
        }

        // Recursively find the minimum element in the rest of the array
        int mid = (startIndex + endIndex) / 2;
        T leftMin = recursiveMinimum(array, startIndex, mid);
        T rightMin = recursiveMinimum(array, mid + 1, endIndex);

        // Return the smaller of the two halves
        return (leftMin.compareTo(rightMin) < 0) ? leftMin : rightMin;
    }

    public static void main(String[] args) {
        // Generate a 10-element random double array in the range 1.0 to 49.0
        Random rand = new Random();
        Double[] randomArray = new Double[10];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = 1.0 + rand.nextDouble() * 48.0; // Random doubles between 1.0 and 49.0
        }

        // Display the generated array
        System.out.println("Generated array: " + Arrays.toString(randomArray));

        // Find the minimum element using the recursiveMinimum method
        Double minElement = recursiveMinimum(randomArray, 0, randomArray.length - 1);

        // Display the smallest element of the array
        System.out.println("Smallest element in the array: " + minElement);
    }
}
