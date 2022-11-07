package lk.chathurabuddi.leetcode.challenge.newuser;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map mapping = new HashMap(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int integer = (int)mapping.get(s.charAt(0));
        for (int i=1; i < s.length(); i++) {
            int prev = (int)mapping.get(s.charAt(i-1));
            int current = (int)mapping.get(s.charAt(i));

            if ( prev >= current ) {
                integer = integer + current;
            } else {
                integer = integer + current - (2 * prev);
            }
        }
        return integer;
    }
}
