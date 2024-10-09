/*
 * Create a Java application that validates a date entered by a user. The program should check if the date is in the format "MM/DD/YYYY" (two digits for month, day, and four digits for the year) and if it represents a valid date (e.g., February 30 should be considered invalid). If the entered date is valid, display it in the format "Month Day, Year" (e.g., "February 28, 2023"). If the entered date is invalid, inform the user and grant them two more attempts to enter a valid date. After three unsuccessful attempts, output a termination message.
 */
package Harder;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        dateFormat.setLenient(false);

        System.out.println("Please enter a date in the format MM/DD/YYYY:");

        while (attempts < 3) {
            System.out.print("Attempt " + (attempts + 1) + ": ");
            String dateStr = scanner.nextLine();

            try {
                dateFormat.parse(dateStr); // Attempt to parse the date
                System.out.println("Thank you for entering a valid date!");
                System.out.println("Formatted Date: " + formatDateString(dateStr));
                break;
            } catch (ParseException e) {
                System.out.println("Invalid date format or an invalid date. Please try again.");
                attempts++;
            }
        }

        if (attempts == 3) {
            System.out.println("You have exceeded the maximum number of attempts. Program terminated.");
        }

        scanner.close();
    }

    public static String formatDateString(String dateStr) {
        DateFormat inputFormat = new SimpleDateFormat("MM/dd/yyyy");
        DateFormat outputFormat = new SimpleDateFormat("MMMM dd, yyyy");
        try {
            return outputFormat.format(inputFormat.parse(dateStr));
        } catch (ParseException e) {
            return dateStr;
        }
    }
}
