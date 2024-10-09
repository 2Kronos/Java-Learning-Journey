// Create a Java program to find the sum of all prime numbers between 1 and 100.
public class Question4 {
    public static void main(String[] args) {
        int limit = 100;
        long sum = 0;

        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum += num;
            }
        }

        System.out.println("Sum of prime numbers between 1 and " + limit + " is " + sum);
    }
}
