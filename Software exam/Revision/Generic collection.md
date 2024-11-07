```java
package collection;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;  // Import List
import java.util.Collections;  // Import List
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;



public class RevsionQuestion {
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        
        List<Integer> list = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);

        // Create a Random object
        Random rand = new Random();
        
        //----------------------------------------------------------- Fill the array with random integers between 0 and 99
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(100); //--------------------------- Generates random integers from 0 to 99
        }
        
        //--------------------------------------------------- Add each element from randomArray to the list
        for(int randomArrays : randomArray) {
            list.add(randomArrays);
        }
        
        //------------------------------------------------------------------- Print the list for reference
        System.out.println("Generated list: " + list);
      
        //---------------------------------------------------------------------Print sorted list
        Collections.sort(list);
        System.out.println(" sorted  list: " + list);
        
        //------------------------------------------------------------Create a new list with only duplicate values
        List<Integer> uniqueList = new ArrayList<>();
        
        for (Integer num : list) {
            if (Collections.frequency(list, num) == 1) {
                uniqueList.add(num);  // Add only unique elements
            }
        }
        
        System.out.println("List without duplicates: " + uniqueList);
        
        //-----------------------------------------------------------------Max and Min
        System.out.println("Max value " +Collections.max(list));
        
        System.out.println("Min value " +Collections.min(list));
        // Ask the user for the value to search for
        
        
        //-----------------------------------------------------------------------------------frequency Map
        // Create a map to store frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        //------------------------------------------------------------------- Populate the frequency map
        for (Integer num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequency table
        System.out.println("\nElement\tFrequency");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        //----------------------------------------------------------------------------------------------user entry
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
}

```