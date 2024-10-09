// Collections_Sort2.java: sort (descending)
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Sort2 {
    public static void main(String[] args) {
        List<String> suits = new ArrayList<>();
        suits.add("Hearts");
        suits.add("Diamonds");
        suits.add("Clubs");
        suits.add("Spades");

        // Output initial list
        System.out.printf("Unsorted array elements: %s\n", suits);

        // Sort in descending order
        Collections.sort(suits, Collections.reverseOrder());

        // Output sorted list
        System.out.printf("Sorted array elements: %s\n", suits);
    }
}
