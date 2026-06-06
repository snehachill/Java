public class Palindrome {
    public static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return original == reverse;
    }
    public static void main(String[] args) {
        int num = 12321;
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}