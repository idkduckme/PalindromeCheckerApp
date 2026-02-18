import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "refer";

        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The input string is a confirmed palindrome.");
        } else {
            System.out.println("Result: The input string is NOT a palindrome.");
        }
    }
}
