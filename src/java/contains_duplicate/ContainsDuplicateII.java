package src.java.contains_duplicate;


public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if (k <= 0 || nums.length == 0) {
            return false; // Handle edge cases
        }

        if (k >= nums.length / 2) {
            // Start from the end of the list
            for (int i = nums.length - 1; i >= 0; i--) {
                for (int j = i - 1; j >= 0 && i - j <= k; j--) {
                    if (nums[i] == nums[j]) {
                        return true; // Found duplicate within distance k
                    }
                }
            }
        } else {
            // Start from the beginning of the list
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length && j - i <= k; j++) {
                    if (nums[i] == nums[j]) {
                        return true; // Found duplicate within distance k
                    }
                }
            }
        }

        return false;
    }


    // this way is not a good way to do it, take to much time to solve !
    //best way is to move with window of the k and hastset - >
    /**
     * The optimal approach is to use a data structure that allows constant-time lookup and insertion, such as a HashSet,
     * to keep track of previously encountered elements within a sliding window of size 'k'. As you traverse the array,
     * you add each element to the set and simultaneously check if the current element or any previous element within
     * the window is already in the set.*/

    /**java
     * import java.util.HashSet;

     class Solution {
     public boolean containsNearbyDuplicate(int[] nums, int k) {
     // Edge case: check if k is non-positive or nums is empty
     if (k <= 0 || nums.length == 0) {
     return false;
     }

     HashSet<Integer> set = new HashSet<>();

     for (int i = 0; i < nums.length; i++) {
     // If the current element is already in the set, return true
     if (set.contains(nums[i])) {
     return true;
     }

     // Add the current element to the set
     set.add(nums[i]);

     // If the size of the set exceeds k, remove the oldest element from the set
     if (set.size() > k) {
     set.remove(nums[i - k]);
     }
     }

     // If no duplicates are found within the window, return false
     return false;
     }
     }
     */


}
