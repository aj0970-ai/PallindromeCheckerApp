public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Inject strategy
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

/*
 * INTERFACE : PalindromeStrategy
 * Defines contract for palindrome checking algorithms
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/*
 * CLASS : StackStrategy
 * Implements palindrome checking using Stack
 */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        // Create stack
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare by popping
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}