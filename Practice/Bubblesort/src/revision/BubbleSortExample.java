package revision;

import java.util.Random;
public class BubbleSortExample {
	
	
	// Method to perform bubble sort on an integer array
    public static void bubbleSort(int[] array) {
        int n = array.length;
        
        // Bubble Sort algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Generate a 10-element random integer array with elements ranging from 10 to 99
        int[] randomArray = new int[10];
        Random rand = new Random();

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(90) + 10; // Generates random integers from 10 to 99
        }

        // Display the unsorted array
        System.out.println("Unsorted array:");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }

        // Sort the array using bubble sort
        bubbleSort(randomArray);

        // Display the sorted array
        System.out.println("\nSorted array:");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
    }

}
