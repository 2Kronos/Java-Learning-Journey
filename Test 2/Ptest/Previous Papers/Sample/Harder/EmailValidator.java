/*
 * Write a Java program that validates an email address entered by a user. The program should check if the email address meets the following requirements:

It contains the "@" symbol.
It contains at least one dot "." after the "@" symbol.
It does not start or end with "@" or ".".
If the entered email address is valid, the program should display a message thanking the user and print the email address. Otherwise, it should inform the user that the email address is invalid and grant them two more attempts to enter a valid email address. After three unsuccessful attempts, the program should output an appropriate message and terminate.
 */
package Harder;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        System.out.println("Please enter an email address:");
        
        while (attempts < 3) {
            System.out.print("Attempt " + (attempts + 1) + ": ");
            String emailAddress = scanner.nextLine();

            if (isValidEmail(emailAddress)) {
                System.out.println("Thank you for entering a valid email address!");
                System.out.println("Email address: " + emailAddress);
                break;
            } else {
                System.out.println("Invalid email address format. Please try again.");
                attempts++;
            }
        }

        if (attempts == 3) {
            System.out.println("You have exceeded the maximum number of attempts. Program terminated.");
        }

        scanner.close();
    }

    public static boolean isValidEmail(String emailAddress) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return emailAddress.matches(regex);
    }
}
