package Revision;

public class RevGenericSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test on an Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        Integer intToFind = 3;
        int intIndex = searchElement(intArray, intToFind);
        System.out.println("Integer element " + intToFind + " found at index: " + intIndex);

        // Test on a Double array
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Double doubleToFind = 4.4;
        int doubleIndex = searchElement(doubleArray, doubleToFind);
        System.out.println("Double element " + doubleToFind + " found at index: " + doubleIndex);
		
		
		
		
		
		
	}

	
    public static <T> int searchElement(T[] array, T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                return i; // Return the index if element is found
            }
        }
        return -1; // Return -1 if element is not found
    }
}
