// Fig. 20.8: TimeComparator.java
// Custom Comparator class that compares two Time2 objects.
import java.util.Comparator; // Importing the Comparator interface

// Declaring the TimeComparator class that implements Comparator for Time2 objects
public class TimeComparator implements Comparator<Time2> {
    
    // Overriding the compare method to compare two Time2 objects
    public int compare(Time2 time1, Time2 time2) {
        // Compare the hour fields of the two Time2 objects
        int hourCompare = time1.getHour() - time2.getHour(); // compare hour
        // If the hours are different, return the difference
        if (hourCompare != 0) {
            return hourCompare;
        }

        // Compare the minute fields of the two Time2 objects
        int minuteCompare = time1.getMinute() - time2.getMinute(); // compare minute
        // If the minutes are different, return the difference
        if (minuteCompare != 0) {
            return minuteCompare;
        }

        // Compare the second fields of the two Time2 objects
        int secondCompare = time1.getSecond() - time2.getSecond(); // compare second
        // Return the difference in seconds
        return secondCompare;
    } // end method compare
} // end class TimeComparator
