package src.java.make_array_zero_by_subtracting_equal_amounts;

import java.util.Arrays;

public class MakeArrayZeroBySubtractingEqualAmounts {
    public int minimumOperations(int[] nums) {

        int numberOfOperation = 0;

        // Sort the array in non-decreasing order
        Arrays.sort(nums);

        // Initialize the pointer to the smallest non-zero element
        int i = 0;

        // Traverse the sorted array
        while (i < nums.length) {
            // If the current element is 0, move to the next element
            if (nums[i] == 0) {
                i++;
                continue;
            }

            // Calculate the minimum value to subtract
            int min = nums[i];

            // Update all elements greater than 0 by subtracting min
            for (int j = i; j < nums.length; j++) {
                nums[j] -= min;
            }

            // Increment the number of operations
            numberOfOperation++;
        }

        return numberOfOperation;
    }


    /** the best solution for this problem is ->
     * class Solution {
     *     public int minimumOperations(int[] nums) {
     *         final boolean[] set = new boolean[101];
     *
     *         for(final int a : nums)
     *             if(a > 0)
     *                 set[a] = true;
     *
     *         int count = 0;
     *
     *         for(int i = 0; i < set.length; ++i)
     *             if(set[i])
     *                 count++;
     *
     *         return count;
     *     }
     * }
     * if we have same number in the list, we can set them is one number because it take the same number of opratioen to
     * make them both to 0;
     * */

}
