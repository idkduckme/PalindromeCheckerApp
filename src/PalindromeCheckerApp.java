public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "madam";
        String cleanInput = input.toLowerCase();

        boolean isPalindrome = true;
        int length = cleanInput.length();

        for (int i = 0; i < length / 2; i++) {
            if (cleanInput.charAt(i) != cleanInput.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Testing String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}