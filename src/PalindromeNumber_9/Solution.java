package PalindromeNumber_9;

public class Solution {
    public boolean isPalindrome(int x) {
        int s = x;
        int reverse = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            x /= 10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && lastDigit > 7)) return false;
            if (reverse < Integer.MIN_VALUE / 10) return false;
            reverse = (reverse * 10) + lastDigit;
        }

        return reverse == s;
    }
}
