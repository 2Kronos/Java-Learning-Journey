package fisa;

import java.util.Scanner;

public class CurrentTest2 {
    public static void main(String[] args) {
        // Instantiate a Scanner object to read user input from the keyboard
        Scanner input = new Scanner(System.in);
        
        // Regular expression for validating mobile phone number
        String regex = "((0[6-8][1-4])||(07[689]))-\\d{3}-\\d{4}";
        
        // Prompt user to enter phone number
        System.out.println("\nPlease enter the phone number (in the format: xxx-xxx-xxxx): ");
        String phoneNumber = input.nextLine();
        
        // Initialize counter for attempts
        int counter = 2;
        
        // Loop to give user up to three chances to enter a valid phone number
        while (!(phoneNumber.matches(regex)) && counter >= 1) {
            System.out.printf("\nInvalid input. Please enter the phone number (in the format: xxx-xxx-xxxx) (%d attempts left): \n", counter);
            phoneNumber = input.nextLine();
            counter -= 1;
        }
        
        // Terminate program if invalid phone number is entered three times
        if (!(phoneNumber.matches(regex))) {
            System.out.println("\nNumber of attempts exceeded. Terminating program ...");
            System.exit(0);
        }
        
        // Display the valid phone number
        System.out.printf("\nThe phone number [%s] is valid\n", phoneNumber);
        
        // Split phone number into components
        String[] phoneNumberParts = phoneNumber.split("-");
        
        // Display the components of the phone number
        System.out.printf("\nCode: %s\n", phoneNumberParts[0]);
        System.out.printf("Number: %s-%s\n", phoneNumberParts[1], phoneNumberParts[2]);
        
        // Extract third digit to determine the network
        char code = phoneNumberParts[0].charAt(2);
        
        // Determine and display the network based on the third digit of the code
        switch (code) {
            case '1':
                System.out.println("\nNetwork: Telkom Mobile");
                break;
            case '2':
            case '6':
            case '9':
                System.out.println("\nNetwork: Vodacom");
                break;
            case '3':
            case '8':
                System.out.println("\nNetwork: MTN");
                break;
            case '4':
                System.out.println("\nNetwork: Cell C");
                break;
            default:
                System.out.println("Unknown network");
                break;
        }
    }
}
