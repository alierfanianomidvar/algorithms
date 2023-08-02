/**
 *
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 You may assume that each input would have exactly one solution, and you may not use the same element twice.
 You can return the answer in any order.
 Example 1:
 Input: nums = [2,7,11,15], target = 9
 Output: [0,1]
 Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 Example 2:
 Input: nums = [3,2,4], target = 6
 Output: [1,2]

 Example 3:

 Input: nums = [3,3], target = 6
 Output: [0,1]


 Constraints:

 2 <= nums.length <= 104
 -109 <= nums[i] <= 109
 -109 <= target <= 109
 Only one valid answer exists.


 Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 * */

/*-----------------------------------------------------------------------------------*/
package src.java.two_sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // HasMap use less memory, so it is better here to use it.
        for (int i = 0; i < nums.length; i++) {
            // We want to find a two number that sum of these two become the target, we have the first number = nums[i].
            // So we only need to find the other one ->  complement.
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // we find it :) !!
            }
            map.put(nums[i], i);

            // other way is to use to 2 for loop but this is not the best solution.
        }
        return new int[0];
    }

    /**
     * HASHMAP ->
     *      use less memory - maintain insertion order - only store unique obj.
     *      order -> o(1)
     * */
}
