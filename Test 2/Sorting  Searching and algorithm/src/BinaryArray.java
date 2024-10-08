import java.util.Random;
import java.util.Arrays;

public class BinaryArray {
	//instance variables 
    private int[] data; // array to hold integer values
    private static final Random generator = new Random(); //static random object used to 
    //create randonNumbers

    // create array of given size and fill with random integers
    public BinaryArray(int size) {
        data = new int[size]; // create space for array

        // fill array with random ints in range 10-99
        for (int i = 0; i < size; i++)
            data[i] = 10 + generator.nextInt(90);

        Arrays.sort(data);//sort array
    } // end BinaryArray constructor

    // perform a binary search on the data
    public int binarySearch(int searchElement) {
        int low = 0; // low end of the search area
        int high = data.length - 1; // high end of the search area
        int middle = (low + high + 1) / 2; // middle element
        int location = -1; // return value; -1 if not found

        do { // loop to search for element
            // if the element is found at the middle
            if (searchElement == data[middle])
                location = middle; // location is the current middle
            // middle element is too high
            else if (searchElement < data[middle])
                high = middle - 1; // eliminate the higher half
            
            else // middle element is too low
                low = middle + 1; // eliminate the lower half
            

            middle = (low + high + 1) / 2; // recalculate the middle
        } while ((low <= high) && (location == -1));

        return location; // return location of search key
    } // end method binarySearch

    // method to output certain values in array
    public String remainingElements(int low, int high) {
        StringBuilder temporary = new StringBuilder();

        // output spaces for alignment
        for (int i = 0; i < low; i++)
            temporary.append(" ");

        // output elements left in array
        for (int i = low; i <= high; i++)
            temporary.append(data[i] + " ");

        temporary.append("\n");
        return temporary.toString();
    } // end method remainingElements

    // method to output values in array
    public String toString() {
        return remainingElements(0, data.length - 1);
    } // end method toString
} // end class BinaryArray
