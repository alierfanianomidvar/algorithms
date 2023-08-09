/**
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 * <p>
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * -231 <= x <= 231 - 1
 */

package src.java.palindrome_number;

import java.util.ArrayList;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        int original = x;
        int reversNumber = 0;
        if (x < 0) {
            return false;
        } else if (x < 10 && x >= 0) {
            return true;
        } else if (x % 10 == 0) {
            return false;
        } else {
            while (x > 0) {
                int number = x % 10;
                reversNumber = reversNumber * 10 + number;
                x /= 10;
            }
            return original == reversNumber;
        }
    }
}


/*
# Approach

Based on the description of the problem, we need to consider the numbers `-121` and `10`. Neither of these two numbers
 is a palindrome because they cannot be reversed to still retain the same number.

To address this, we can eliminate any numbers that are negative or have zero at the end. We can achieve this by
including the following checks at the beginning of the code:

```
if (x < 0){
    return false;
} else if ( x % 10 == 0){
    return false;
}

```
By incorporating these checks at the start of the code, we can achieve faster results in the end.

Additionally, we should exclude values below `10`, such as `9`, `8`, and so on, from the initial consideration.

After these initial checks, we need to reverse the number. If the reversed number is equal to the original number, then we have a palindrome number.

# Complexity
- Time complexity: $$O(LogN)$$

- Space complexity: $$O(1)$$

*/