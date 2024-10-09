import java.util.*;

public class GenericSearch {
    public static void main(String[] args) {
        // Instantiate integer, double, and string arrays as specified
        Integer[] integerArray = {8, 21, 6, 1, 24, 9, 47, 36, 18, 38};
        Double[] doubleArray = {14.7, 7.84, 20.58, 26.46, 35.28, 10.78, 35.28, 6.86, 30.87, 17.15};
        String[] stringArray = {"blue", "red", "yellow", "green", "white", "cyan", "magenta", "grey", "black", "brown"};

        // Obtain a list view of each of the arrays to enable using Collections methods
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(stringArray));
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(integerArray));
        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(doubleArray));

        // Instantiate a Scanner object to accept user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter an integer to search for
        System.out.println("Enter an integer to search for:");
        int intSearchElement = input.nextInt();
        input.nextLine(); // Consume newline

        // Search for the integer input and print the result
        int index = search(integerList.toArray(new Integer[0]), intSearchElement);
        if (index != -1) {
            System.out.printf("%d was found at index %d in array: %s\n", intSearchElement, index, Arrays.toString(integerArray));
        } else {
            System.out.printf("%d was not found in array: %s\n", intSearchElement, Arrays.toString(integerArray));
        }

        // Prompt user to enter a double to search for
        System.out.println("Enter a floating point number to search for:");
        double doubleSearchElement = Double.parseDouble(input.nextLine());

        // Search for the double input and print the result
        index = search(doubleList.toArray(new Double[0]), doubleSearchElement);
        if (index != -1) {
            System.out.printf("%.2f was found at index %d in array: %s\n", doubleSearchElement, index, Arrays.toString(doubleArray));
        } else {
            System.out.printf("%.2f was not found in array: %s\n", doubleSearchElement, Arrays.toString(doubleArray));
        }

        // Prompt user to enter a string to search for
        System.out.println("Enter a word to search for:");
        String stringSearchElement = input.nextLine();

        // Search for the string input and print the result
        index = search(stringList.toArray(new String[0]), stringSearchElement);
        if (index != -1) {
            System.out.printf("\"%s\" was found at index %d in array: %s\n", stringSearchElement, index, Arrays.toString(stringArray));
        } else {
            System.out.printf("\"%s\" was not found in array: %s\n", stringSearchElement, Arrays.toString(stringArray));
        }
    }

    // Define a generic method to search an element entered by user
    public static <T extends Comparable<T>> int search(T[] array, T searchTerm) {
        return Arrays.binarySearch(array, searchTerm);
    }
}
