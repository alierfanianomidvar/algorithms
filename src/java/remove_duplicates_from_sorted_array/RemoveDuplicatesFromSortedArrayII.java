/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 * <p>
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 * <p>
 * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 * Custom Judge:
 * <p>
 * The judge will test your solution with the following code:
 * <p>
 * int[] nums = [...]; // Input array
 * int[] expectedNums = [...]; // The expected answer with correct length
 * <p>
 * int k = removeDuplicates(nums); // Calls your implementation
 * <p>
 * assert k == expectedNums.length;
 * for (int i = 0; i < k; i++) {
 * assert nums[i] == expectedNums[i];
 * }
 * If all assertions pass, then your solution will be accepted.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * Example 2:
 * <p>
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */


package src.java.remove_duplicates_from_sorted_array;

public class RemoveDuplicatesFromSortedArrayII {
    public int Solution(int[] nums) {
        int x = 0, y = 1;  // Initialize two pointers, x and y, to track unique elements.
        int size = nums.length;  // Get the length of the input array.
        int n = 0;
        if (size > 1) {  // Check if the array has more than 1 value.
            while (y < size) {  // Iterate through the array using pointers x and y.
                if (nums[x] != nums[y]) {  // Compare the elements at indices x and y.
                    n = 0;
                    x++;  // Increment x to move to the next position for a unique element.
                    nums[x] = nums[y];  // Store the unique element at the new position indicated by x.
                } else {
                    n++;
                    if (n < 2) {
                        x++;  // Increment x to move to the next position for a unique element.
                        nums[x] = nums[y];  // Store the unique element at the new position indicated by x.
                    }
                }
                y++;  // Move the y pointer to check the next element in the array.
            }
            size = x + 1;  // Update the size to the count of unique elements found.
        }

        return size;  // Return the count of unique elements in the modified array.
    }

}
