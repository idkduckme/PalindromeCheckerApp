
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";

        // Step 1: Convert string to character array
        char[] charArray = input.toLowerCase().toCharArray();

        // Step 2: Initialize start and end pointers
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;

        // Step 3: Compare characters using two-pointer technique
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Step 4: Display the result
        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}