/**
 * ================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Developer
 * @version 3.0
 */

import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();

        // Reverse the string using a loop
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Compare original and reversed strings
        if (input.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}public class PallindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("Welcome to the Palindrome Checker System");
        System.out.println("==============================================");
        System.out.println("System Version: 1.0");
        System.out.println("Status: Startup Flow Established.");
        System.out.println("----------------------------------------------");
    }
}