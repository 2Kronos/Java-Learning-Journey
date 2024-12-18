package fisa;
import java.io.*;
import java.util.Random;
public class CurrentTestOne {
	

    // Method to generate a 10-element array with random integers in the range 1 to 50
    public static int[] generateRandomArray() {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(50) + 1; // Random number between 1 and 50
        }
        return array;
    }

    // Non-recursive (iterative) method to find the maximum value in the array
    public static int findMaxIterative(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Recursive method to find the maximum value in the array
    public static int findMaxRecursive(int[] array, int index) {
        if (index == array.length - 1) {
            return array[index];
        } else {
            int maxRest = findMaxRecursive(array, index + 1);
            return Math.max(array[index], maxRest);
        }
    }

    // Method to print and write results to a file
    public static void printAndWriteToFile(int[] array, int maxIterative, int maxRecursive) {
        try {
            // Create a BufferedWriter to write the results to a file
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            // Print and write the generated array
            System.out.println("Array: " + java.util.Arrays.toString(array));
            writer.write("Array: " + java.util.Arrays.toString(array) + "\n");

            // Print and write the result of the non-recursive method
            System.out.println("Maximum element in array (non-recursive algorithm): " + maxIterative);
            writer.write("Maximum element in array (non-recursive algorithm): " + maxIterative + "\n");

            // Print and write the result of the recursive method
            System.out.println("Maximum element in array (recursive algorithm): " + maxRecursive);
            writer.write("Maximum element in array (recursive algorithm): " + maxRecursive + "\n");

            // Print build success message and write it to the file
            System.out.println("-----------------------------------------------------");
            writer.write("-----------------------------------------------------\n");
            System.out.println("BUILD SUCCESS");
            writer.write("BUILD SUCCESS\n");

            // Close the writer
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Generate the random array
        int[] randomArray = generateRandomArray();

        // Calculate the max values using both methods
        int maxIterative = findMaxIterative(randomArray);
        int maxRecursive = findMaxRecursive(randomArray, 0);

        // Display the results
        printAndWriteToFile(randomArray, maxIterative, maxRecursive);
    }

}
