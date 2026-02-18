public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String original = "radar";
        String reversed = "";

        // Step 1: Iterate the string in reverse order and build the new string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Step 2: Compare original and reversed strings
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);

        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}