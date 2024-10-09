import java.util.Scanner;

public class LinearSearchTest {
    // perform a linear search on the data
//    public static int linearSearch(int[] data, int searchKey) {
//        // loop through array sequentially
//        for (int index = 0; index < data.length; index++) {
//            if (data[index] == searchKey)
//                return index; // return index of integer
//        }

      //  return -1; // integer was not found
   // }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
z
        int[] dataArray = { 20, 50, 30, 10, 40 };
        System.out.println("Enter integer search key: ");
        
        int searchInt = input.nextInt(); // read first int from user
        
        while (searchInt != -1) {
            int position = linearSearch(dataArray, searchInt);
            
            if (position == -1) // not found
                System.out.println("The integer " + searchInt + " was not found.");
            else // integer was found
                System.out.println("The integer " + searchInt + " was found in position " + position);
            
            System.out.print("\nEnter integer value (-1 to quit): ");
            searchInt = input.nextInt(); // read next int from user
        } 
    } 
} 
// end class LinearSearchTest
