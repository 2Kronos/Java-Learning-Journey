import java.util.ArrayList;
import java.util.Collections;

// Collections method sort with custom Comparator
public class MainComparator {
    public static void main(String[] args) {
        // create list
        ArrayList<Time> list = new ArrayList<Time>();
        
        // add elements to list
        list.add(new Time(6, 24, 34));
        list.add(new Time(18, 14, 58));
        list.add(new Time(6, 05, 34));
        list.add(new Time(12, 14, 58));
        
        // output list elements
        System.out.printf("Unsorted array elements:\n%s\n", list);
        
        // sort in order using a comparator
        Collections.sort(list, new TimeComparator());
        
        // output list elements
        System.out.printf("Sorted array elements:\n%s\n", list);
    }
}
