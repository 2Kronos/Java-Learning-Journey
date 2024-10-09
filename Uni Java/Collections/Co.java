import java.util.*;

public class CollectionTut {
    public static void main(String[] args) {
        // Create a List of random integers
        List<Integer> numberList = new ArrayList<>(Arrays.asList(23, 14, 35, 9, 47, 18, 4, 10));
        System.out.println("Original List: " + numberList);

        // Sort the List in ascending order using Collections.sort
        Collections.sort(numberList);
        System.out.println("Sorted List (Ascending): " + numberList);

        // Sort the List in descending order using Collections.sort with a custom Comparator
        Collections.sort(numberList, Collections.reverseOrder());
        System.out.println("Sorted List (Descending): " + numberList);

        // Search for a number using binarySearch
        int index = Collections.binarySearch(numberList, 18);
        if (index >= 0) {
            System.out.println("Number 18 found at index: " + index);
        } else {
            System.out.println("Number 18 not found.");
        }

        // Shuffle the List randomly
        Collections.shuffle(numberList);
        System.out.println("Shuffled List: " + numberList);

        // Find the minimum and maximum values in the List
        int min = Collections.min(numberList);
        int max = Collections.max(numberList);
        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);

        // Create a Set from the List to eliminate duplicates
        Set<Integer> uniqueNumbers = new HashSet<>(numberList);
        System.out.println("Unique Numbers (Set): " + uniqueNumbers);
    }
}
