package src.java.ugly_number;


/**
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * <p>
 * Given an integer n, return true if n is an ugly number.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 6
 * Output: true
 * Explanation: 6 = 2 × 3
 * Example 2:
 * <p>
 * Input: n = 1
 * Output: true
 * Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
 * Example 3:
 * <p>
 * Input: n = 14
 * Output: false
 * Explanation: 14 is not ugly since it includes the prime factor 7.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * -231 <= n <= 231 - 1
 */
public class UglyNumber {

    public boolean Solution(int n) {
        if (n == 0) {
            return false;
        } else if (n > 0 && n <= 3) { // smallest prime number, if we factor base 2,3,5, we always reach to theis numbers.
            return true;
        } else if (n % 2 == 0) {
            return Solution(n / 2);
        } else if (n % 3 == 0) {
            return Solution(n / 3);
        } else if (n % 5 == 0) {
            return Solution(n / 5);
        }
        return false;
    }
}
