/*Create a Java application that validates a password entered by a user. The program should check if the password meets the following requirements:

It is at least 8 characters long.
It contains at least one uppercase letter, one lowercase letter, and one digit.
If the entered password is valid, display a message thanking the user. If the password is invalid, inform the user and grant them two more attempts to enter a valid password. After three unsuccessful attempts, output a termination message.
*/
package Harder;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        System.out.println("Please enter a password:");
        
        while (attempts < 3) {
            System.out.print("Attempt " + (attempts + 1) + ": ");
            String password = scanner.nextLine();

            if (isValidPassword(password)) {
                System.out.println("Thank you for entering a valid password!");
                break;
            } else {
                System.out.println("Invalid password format. Please try again.");
                attempts++;
            }
        }

        if (attempts == 3) {
            System.out.println("You have exceeded the maximum number of attempts. Program terminated.");
        }

        scanner.close();
    }

    public static boolean isValidPassword(String password) {
        // Check if the password meets the requirements
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$");
    }
}
