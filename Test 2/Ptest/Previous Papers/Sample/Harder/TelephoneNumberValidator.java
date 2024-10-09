package Harder;
import java.util.Scanner;

public class TelephoneNumberValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        System.out.println("Please enter a telephone number in the format (XXX) XXX-XXXX:");
        
        while (attempts < 3) {
            System.out.print("Attempt " + (attempts + 1) + ": ");
            String phoneNumber = scanner.nextLine();

            if (isValidPhoneNumber(phoneNumber)) {
                // Extract area code and phone number
                String areaCode = phoneNumber.substring(1, 4);
                String restOfNumber = phoneNumber.substring(6);

                System.out.println("Thank you for entering a valid telephone number!");
                System.out.println("Area code: " + areaCode);
                System.out.println("Phone number: " + areaCode + "-" + restOfNumber);

                break; // Exit the loop after a valid number is entered
            } else {
                System.out.println("Invalid telephone number format. Please try again.");
                attempts++;
            }
        }

        if (attempts == 3) {
            System.out.println("You have exceeded the maximum number of attempts. Program terminated.");
        }

        scanner.close();
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Check the format using a regular expression
        String regex = "\\(0[0-5][0-9]\\) [0-9]{3}-[0-9]{4}";
        return phoneNumber.matches(regex);
    }
}
