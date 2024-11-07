package fisa;
import java.util.Random;
public class lastYearTest2Q1 {
	
	// Recursive method to find the minimum element in the array
    public static int recursiveMinimum(int[] array, int index) {
        // Base case: if we've reached the last element, return it
        if (index == array.length - 1) {
            return array[index];
        } 
        
        // Recursive case: find the minimum of the current element and the result of the rest of the array
        int minOfRest = recursiveMinimum(array, index + 1);
        
        // Return the smaller value between the current element and the minimum of the rest of the array
        return Math.min(array[index], minOfRest);
    }

    public static void main(String[] args) {
        // Generate a 10-element array with random integers between 10 and 49
        Random random = new Random();
        int[] randomArray = new int[10];
        
        System.out.println("Generated Array: ");
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(40) + 10;  // Generates random integers between 10 and 49
            System.out.print(randomArray[i] + " ");
        }

        // Find the smallest element using the recursive method
        int smallestElement = recursiveMinimum(randomArray, 0);

        // Display the smallest element
        System.out.println("\nSmallest Element: " + smallestElement);
    }
}
