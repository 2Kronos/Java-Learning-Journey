import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] numbers = new int[10000000];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100000000);
		}

		System.out.println("Before:");
		printArray(numbers);

		insertionSort(numbers);

		System.out.println("\nAfter:");
		printArray(numbers);
	}
  //
	private static void insertionSort(int[] inputArray) {
		for (int i = 1; i < inputArray.length; i++) {
			// For each value we will loo at we will copy it to a temp variable
      //
			int currentValue = inputArray[i];
			
			int j = i - 1;

      //Now we will need to walk from the current ellement in the arrray to the beginning of the array
      // For each element that we run to that is greater than the current value we will move it to the right
      //We initilaise j to the valyue before so we set it to i - 1
      //j>=0 will stop us from going out of bounds
      //LoOk at the current value at j  and if its greater than the current value[i] we will move it to the right
      //the loop will only stop when we find a value that is less than or eqaul to the current value that we want to see then 
      //we will insert the current value at the position j + 1
			while (j >= 0 && inputArray[j] > currentValue) {
				inputArray[j + 1] = inputArray[j]; //shift the value to the right
				j--;//to keep moving to the left
			}
			inputArray[j + 1] = currentValue;
		}

	}

	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}