// Fig. 20.6: Sort1.java
// Collections method sort (ascending)
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Sort1 {
    public static void main(String[] args) {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

        // Create and display a list containing the suits array elements
        List<String> list = new ArrayList<>(Arrays.asList(suits)); // create List
        System.out.printf("Unsorted array elements: %s\n", list);

        Collections.sort(list); // sort ArrayList

        // output List
        System.out.printf("Sorted array elements: %s\n", list);
    } // end main
} // end class Sort1
