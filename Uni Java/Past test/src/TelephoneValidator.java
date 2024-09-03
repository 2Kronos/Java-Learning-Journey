import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        int attempts = 0;
        boolean isValid = false;

        // Regular expression to match the required phone number format
        String regex = "\\(0[0-5]\\d\\) \\d{3}-\\d{4}";
        Pattern pattern = Pattern.compile(regex);

        // Prompt the user up to three times to enter a valid phone number
        while (attempts < 3 && !isValid) {
            System.out.print("Enter a telephone number in the format (XXX) XXX-XXXX: ");
            phoneNumber = scanner.nextLine();
            Matcher matcher = pattern.matcher(phoneNumber);

            if (matcher.matches()) {
                isValid = true;
                System.out.println("Thank you!");
                System.out.println("Area code: " + phoneNumber.substring(1, 4));
                System.out.println("Phone number: " + phoneNumber.substring(6));
            } else {
                attempts++;
                if (attempts < 3) {
                    System.out.println("Invalid format. Please try again.");
                }
            }
        }

        if (!isValid) {
            System.out.println("You have entered an invalid telephone number three times. The program will now terminate.");
        }
    }
}
