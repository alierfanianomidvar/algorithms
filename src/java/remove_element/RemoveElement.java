/**
 *
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 *
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 *
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 * Custom Judge:
 *
 * The judge will test your solution with the following code:
 *
 * int[] nums = [...]; // Input array
 * int val = ...; // Value to remove
 * int[] expectedNums = [...]; // The expected answer with correct length.
 *                             // It is sorted with no values equaling val.
 *
 * int k = removeElement(nums, val); // Calls your implementation
 *
 * assert k == expectedNums.length;
 * sort(nums, 0, k); // Sort the first k elements of nums
 * for (int i = 0; i < actualLength; i++) {
 *     assert nums[i] == expectedNums[i];
 * }
 * If all assertions pass, then your solution will be accepted.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 2.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * Example 2:
 *
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
 * Note that the five elements can be returned in any order.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 *
 *
 * Constraints:
 *
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 50
 * 0 <= val <= 100
 * */

package src.java.remove_element;

public class RemoveElement {
    public int Solution(int[] nums, int val) {
        int insertIndex = 0;
        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            if (nums[currentIndex] != val) {
                nums[insertIndex] = nums[currentIndex];
                insertIndex++;
            }
        }
        return insertIndex;
    }

    /*
    This is one is fun !!!
    For solving this we do not need two different for, at first I think that too but this is very cool :)

    ok let see how this will work =>

    what is insertIndex or currentIndex ? let answer this with an example:

    input : [3,2,2,3] val : 3 -> output we need  -> [2,2] return value 2

    1. insertIndex == 0;
    2. currentIndex == 0; -> nums[0] != 3; False; so we do not go inside "if"
    3. currentIndex == 1; -> nums[1] != 3; True;
        3.1. nums[0] = nums[1]; => list : [2,2,2,3]
        3.2. insertIndex == 1;
    4. currentIndex == 2; -> nums[2] != 3; True;
        4.1. nums[1] = nums[2]; => list : [2,2,2,3]
        4.2. insertIndex == 2;
    4. currentIndex == 3; -> nums[3] != 3; False; so we do not go inside "if"
    5. we are in the end of the list, and we will return the insertIndex number, this is the number of val we have in the
    list.

    out we will see [2,2]. !!!!

    Done !!!;

    */
}
