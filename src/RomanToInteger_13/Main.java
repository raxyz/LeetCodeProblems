package RomanToInteger_13;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String[] targets = {"III", "IV", "IX", "LVIII", "MCMXCIV", "asd"};

        for (String t : targets) {
            System.out.println(s.romanToInt(t));
        }
    }
}
