/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * <p>
 * Increment the large integer by one and return the resulting array of digits.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * Example 2:
 * <p>
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * Example 3:
 * <p>
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * digits does not contain any leading 0's.
 */


package src.java.plus_one;

public class PlusOne {
    public int[] solution(int[] digits) {

        int length = digits.length;

        if(digits[length-1] < 9 ){
            digits[length-1] ++;
            return digits;
        } else if (length == 1){
            return new int[]{1,0};
        } else{
            digits[length - 1]++;
            int carry = 0;
            for (int i = digits.length - 1; i >= 0; i--) {
                int sum = digits[i] + carry;
                if (sum >= 10) {
                    carry = 1;
                    digits[i] = sum % 10;
                } else {
                    carry = 0;
                    digits[i] = sum;
                }
            }
            if(carry != 0 ){
                int[] result = new int[length + 1];
                result[0] = 1;
                System.arraycopy(digits, 0, result, 1, digits.length);
                return result;
            }
            return digits;
        }
    }
}
