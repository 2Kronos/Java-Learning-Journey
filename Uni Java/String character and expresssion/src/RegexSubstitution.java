import java.util.Arrays;

public class RegexSubstitution {
    public static void main(String[] args) {
        String firstString = "This sentence ends in 5 stars *****";
        String secondString = "1,2, 3,4,5, 6,7,8";

        System.out.printf("Original String 1: %s\n", firstString);

        // Replace '*' with '^'
        firstString = firstString.replaceAll("\\*", "^");
        System.out.printf("^ substituted for *: %s\n", firstString);

        // Replace 'stars' with 'carets'
        firstString = firstString.replaceAll("stars", "carets");
        System.out.printf("\"carets\" substituted for \"stars\": %s\n", firstString);

        // Replace words with 'word'
        firstString = firstString.replaceAll("\\w+", "word");
        System.out.printf("Every word replaced by \"word\": %s\n\n", firstString);

        System.out.printf("Original String 2: %s\n", secondString);

        // Replace first three digits with 'digit'
        for (int i = 0; i < 3; i++) {
            secondString = secondString.replaceFirst("\\d", "digit");
        }
        System.out.printf("First three digits replaced by \"digit\": %s\n", secondString);
    }
}
