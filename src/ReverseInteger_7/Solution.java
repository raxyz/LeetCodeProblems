package ReverseInteger_7;

public class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        if (isNegative) {
            x = -x;
        }
        String s = Integer.toString(x);

        StringBuilder res = new StringBuilder();
        for (char i : s.toCharArray()) {
            res.insert(0, i);
        }
        int r;
        try {
            r = Integer.parseInt(res.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        if (isNegative) {
            r = -r;
        }

        return r;

//        Faster and better way
//
//        int reverse = 0;
//
//        while (x != 0) {
//            int lastDigit = x % 10;
//            x /= 10;
//            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && lastDigit > 7)) return 0;
//            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && lastDigit < -8)) return 0;
//            reverse = (reverse * 10) + lastDigit;
//        }
//
//        return reverse;
    }
}
