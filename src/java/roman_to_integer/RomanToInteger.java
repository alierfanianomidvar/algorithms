package src.java.roman_to_integer;

import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String s) {

        // First we save the roman the number in hash map
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int outPutNumber = 0;

        for(int index = s.length() - 1; index >= 0; index--){
            int currentValue = romanValues.get(s.charAt(index));
            if( 4 * currentValue >= outPutNumber){
                outPutNumber += currentValue;
            } else {
                outPutNumber -= currentValue;
            }
        }

        System.out.println("output : " + outPutNumber);

        return outPutNumber;
    }
}
