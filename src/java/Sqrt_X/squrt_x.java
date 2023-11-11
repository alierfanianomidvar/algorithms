
/*
* Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.


Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.


Constraints:

0 <= x <= 231 - 1Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.


Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.


Constraints:

0 <= x <= 231 - 1
**/

package src.java.Sqrt_X;

public class squrt_x {
    public int mySqrt(int x) {
//        if (x <= 1) {
//            return x;
//        }
//        int len = String.valueOf(x).length();
//        long number = (len % 2 == 0) ? (long) Math.pow(10, len / 2 - 1) : (long) Math.pow(10, len / 2);
//        while (number * number <= x) {
//            number++;
//        }
//        return (int) number - 1;

//        if(x == 1)
//            return x;
//
//        long n = 1;
//        while (n*n <= x){
//            n = x/2;
//        }
//        while (n * n <= x) {
//            n++;
//       }


        if (x <= 1) { // For the value below 1  we do not need to do the calulation !!
            return x;
        }

        // we do not need go throw the all the numbers. we will divied the number.
        // What is the low and high ?
        // We will talk about this wiht an eample.
        // The x is 105 so the ->
        // low = 0 , high = 105
        // mid = 52
        // squared = mid in power 2 -> squared = 2705
        // the number we have its very big !!
        // we need to goo to the lower haft of the numbers so low = 0, high = 53,
        // we will do this until we reach out number - > 10.

        long low = 0;
        long high = x;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long squared = mid * mid;

            if (squared == x) {
                return (int) mid;
            } else if (squared < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int) high; // 'high' is the floor of the square root of x
    }
}
