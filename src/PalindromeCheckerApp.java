
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "deified";

        // Start recursive check from index 0 to length - 1
        boolean isPalindrome = check(input.toLowerCase(), 0, input.length() - 1);

        // Display results
        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome (validated via recursion).");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }


    private static boolean check(String s, int start, int end) {
        // Base Case: If pointers cross or meet, all characters matched
        if (start >= end) {
            return true;
        }

        // Check if characters at current pointers match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Step: Move inward
        return check(s, start + 1, end - 1);
    }
}