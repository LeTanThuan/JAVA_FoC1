
import java.util.Scanner;

public class Ex2_CapitalizeaProperName {

    public static String normalizeName(String fullName) {

        fullName = fullName.trim();

        String[] words = fullName.split("\\s+");

        StringBuilder normalized = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {

                    String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                normalized.append(capitalized).append(" ");
            }
        }

        return normalized.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Full Name: ");
        String input = scanner.nextLine();

        String output = normalizeName(input);
        System.out.println("Full Name After Capitalizea: " + output);
    }
}
