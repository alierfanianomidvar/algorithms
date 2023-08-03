package src.java.roman_to_integer;

import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String s) {

        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        return 0;
    }
}
