/*
 * Write a Java program that validates a username entered by a user. The program should check if the username meets the following requirements:

It contains only alphanumeric characters (letters and digits).
It is between 5 and 15 characters in length.
It does not start with a digit.
If the entered username is valid, display a message thanking the user and print the username. If the username is invalid, inform the user and grant them two more attempts to enter a valid username. After three unsuccessful attempts, output an appropriate message and terminate.
 */
package Harder;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        System.out.println("Please enter a username:");
        
        while (attempts < 3) {
            System.out.print("Attempt " + (attempts + 1) + ": ");
            String username = scanner.nextLine();

            if (isValidUsername(username)) {
                System.out.println("Thank you for entering a valid username!");
                System.out.println("Username: " + username);
                break;
            } else {
                System.out.println("Invalid username format. Please try again.");
                attempts++;
            }
        }

        if (attempts == 3) {
            System.out.println("You have exceeded the maximum number of attempts. Program terminated.");
        }

        scanner.close();
    }

    public static boolean isValidUsername(String username) {
        // Check if the username meets the requirements
        return username.matches("^[a-zA-Z][a-zA-Z0-9]{4,14}$");
    }
}
