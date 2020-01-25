package RomanToInteger_13;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        int res = 0;

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        char[] array = s.toUpperCase().toCharArray();
        int length = array.length;

        for (int i = 0; i < length; i++) {
            String pair = String.valueOf(array[i]);
            if (i < length - 1 && map.containsKey(pair + array[i + 1])) {
                pair += array[i + 1];
                i++;
            }

            if (!map.containsKey(pair)) {
                return -1;
            }

            res += map.get(pair);

        }

        return res;
    }
}
