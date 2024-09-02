public class ValidateInput {
    // Validate first name
    public static boolean validateFirstName(String firstName) {
        return firstName.matches("[A-Z][a-zA-Z]*");
    }

    // Validate last name
    public static boolean validateLastName(String lastName) {
        return lastName.matches("[a-zA-Z]+(['-][a-zA-Z]+)*");
    }

    // Validate address
    public static boolean validateAddress(String address) {
        return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    // Validate city
    public static boolean validateCity(String city) {
        return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    // Validate state
    public static boolean validateState(String state) {
        return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    // Validate zip
    public static boolean validateZip(String zip) {
        return zip.matches("\\d{5}");
    }

    // Validate phone
    public static boolean validatePhone(String phone) {
        return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }
}
