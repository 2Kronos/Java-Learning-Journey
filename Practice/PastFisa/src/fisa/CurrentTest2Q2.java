package fisa;


import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class CurrentTest2Q2 {
	
    public static void main(String[] args) {
        // Create an array with random values
        Integer[] randomArray = new Integer[10];
        List<Integer> list = new ArrayList<>();
        
        // Create a Random object to generate random numbers
        Random rand = new Random();
        
        // Fill the array with random integers between 0 and 99
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(100); // Generates random integers from 0 to 99
        }
        
        // Add each element from randomArray to the list
        for (Integer num : randomArray) {
            list.add(num);
        }
        
        // Print the generated list for reference
        System.out.println("Generated list: " + list);
      
        // Sort and print the list
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
        
        // Use the generic methods for min, max, and frequency
        System.out.println("Max value: " + findMax(list));
        System.out.println("Min value: " + findMin(list));
        
        // Create a map to store frequency of each element
        Map<Integer, Integer> frequencyMap = getFrequencyMap(list);
        
        // Print the frequency table
        System.out.println("\nElement\tFrequency");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        // User input for search value
        Scanner input = new Scanner(System.in);
        System.out.println("Input a value to search for:");
        int searchValue = input.nextInt();  // Read the user's input
        
        // Search the list for the specified value
        if (list.contains(searchValue)) {
            System.out.println("The value " + searchValue + " was found in the list.");
        } else {
            System.out.println("The value " + searchValue + " was not found in the list.");
        }

        input.close();  // Close the scanner to prevent resource leak
    }

    // Generic method to find the maximum value in a list
    public static <T extends Number & Comparable<T>> T findMax(List<T> list) {
        T max = list.get(0);  // Assume the first element is the maximum
        for (T element : list) {
            if (element.compareTo(max) > 0) {
                max = element;  // Update max if a larger element is found
            }
        }
        return max;
    }

    // Generic method to find the minimum value in a list
    public static <T extends Number & Comparable<T>> T findMin(List<T> list) {
        T min = list.get(0);  // Assume the first element is the minimum
        for (T element : list) {
            if (element.compareTo(min) < 0) {
                min = element;  // Update min if a smaller element is found
            }
        }
        return min;
    }

    // Generic method to get the frequency of each element in a list
    public static <T> Map<T, Integer> getFrequencyMap(List<T> list) {
        Map<T, Integer> frequencyMap = new HashMap<>();
        for (T element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        return frequencyMap;
    }
}
