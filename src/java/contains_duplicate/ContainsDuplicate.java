package src.java.contains_duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> visited = new HashSet<>();

        for (int num : nums) {
            if (visited.contains(num)) {
                return true;
            } else {
                visited.add(num);
            }
        }

        return false;
    }

    // we can solve with another way - >
    // we can sort the list first than move throw the list inside of a for-loop
    /**
     * public boolean containsDuplicate(int[] nums) {
     *         Arrays.sort(nums);
     *         for (int i = 1; i < nums.length; i++) {
     *             if (nums[i] == nums[i - 1]) {
     *                 return true;
     *             }
     *         }
     *         return false;
     *     }
     *     */
    // this nlog(n) and the main way we want is n but this sorted way is more memory efficient.

}
