import java.util.*;

public class ArrayManipulation {
    public static void main(String[] args) {
        // Generate a 10-element random integer array with elements in range 10-30
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 21) + 10;
        }

        // Display generated array

        // Sort array and display it
        Arrays.sort(randomArray);
        System.out.println("Sorted Array: " + Arrays.toString(randomArray));

        // Remove duplicates from sorted array and display result
        int[] uniqueArray = Arrays.stream(randomArray).distinct().toArray();
        System.out.println("Unique Elements: " + Arrays.toString(uniqueArray));

        // Determine sum and floating-point average of unique elements, print results
        int sum = Arrays.stream(uniqueArray).sum();
        double average = sum / (double) uniqueArray.length;
        System.out.printf("Sum: %d\n", sum);
        System.out.printf("Average: %.2f\n", average);

        // Count occurrence of each element in original unsorted array before removing duplicates
        Map<Integer, Integer> elementCountMap = new HashMap<>();
        for (int number : randomArray) {
            elementCountMap.put(number, elementCountMap.getOrDefault(number, 0) + 1);
        }
        System.out.println("Element Counts: " + elementCountMap);


        //create a list of random integers
    }
}
