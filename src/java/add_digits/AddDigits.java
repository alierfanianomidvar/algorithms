/**
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: num = 38
 * Output: 2
 * Explanation: The process is
 * 38 --> 3 + 8 --> 11
 * 11 --> 1 + 1 --> 2
 * Since 2 has only one digit, return it.
 * Example 2:
 * <p>
 * Input: num = 0
 * Output: 0
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= num <= 231 - 1
 */


package src.java.add_digits;

public class AddDigits {

    public int solution(int num) {


        // THE WAY I WENT - >
        /*
        int output = 0;
        boolean flag = true;
        while (flag) {
            output += num % 10;
            num = num / 10;
            if (output >= 10 && num <= 0) {
                num = output;
                output = 0;
                flag = true;
            } else if (num <= 0) {
                flag = false;
            }
        }
        return output;
        */
        if (num == 0) {
            return 0;
        }
        return num % 9 == 0 ? 9 : num % 9; // if we get mode of 9, any number we will get some digit until the have single digit.
    }
}
