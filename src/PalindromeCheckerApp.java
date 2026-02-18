import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Define the input string
        String input = "level";

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {
            // Remove from both ends and compare for symmetry
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Display results
        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The input string is a confirmed palindrome.");
        } else {
            System.out.println("Result: The input string is NOT a palindrome.");
        }
    }
}