/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * Example 2:
 *
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Example 3:
 *
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 * */


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
        // we will start from the end of the list, why ?! ->
        /*
         *  Base on the description of the problem "Roman numerals are usually written largest to smallest from left to
         *  right". So it is easier to start from the end, you only move forward, you do not need to go back.
         * */
        for(int index = s.length() - 1; index >= 0; index--){
            int currentValue = romanValues.get(s.charAt(index));
            /*
            * Here we start checking the value, to find out what we should do!! so we will check the value of output with
            * current value, for example if we have the VII, we will start from I. (without 4 *, will talk about this !!).
            *   1. I => 1 >= 0 => true;
            *       1.2 output += 1; output value is 1.
            *   2. I => 1 >= 1 => true;
            *       2.2 output += 1; output value is 2.
            *   3. V => 5 >= 2 => true;
            *       3.2 output += 1; output value is 7.
            *
            * This will work great but why we will multiply the current value by 4 ?!
            * let's have another example here -> III
            *   In the normal way if move we reach to the point that the first 'if' is not true:
            *       1. I => 1 >= 0 => true;
            *          1.2 output += 1; output value is 1.
            *       2. I => 1 >= 1 => true;
            *          2.2 output += 1; output value is 2.
            *       3. I => 1 >= 2 => false;
            *          3.2 output -= 1; output value is 1.
            *   This is wrong, so we say if we multiply current the value by 4 we solve our problem, the output will be 3.
            *   And 'I' still have lower value than V after the multipling by 4 so the 4 is the max value we can put here.
            *
            * */
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
