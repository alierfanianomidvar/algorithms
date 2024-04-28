package src.java.majority_element;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> hashMap = new HashMap<>(); // using hashmap we can save the number of occurrence in the hash too

        int maxValue = Integer.MIN_VALUE;
        int maxKey = 0;

        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                hashMap.compute(num, (key, value) -> value + 1);
            } else {
                hashMap.put(num, 1);
            }

            if (hashMap.get(num) > maxValue) {
                maxValue = hashMap.get(num);
                maxKey = num;
            }
        }

        return maxKey;
    }

    /*This is not a fast way to find the majority element, we can use another algo just for the majority*/


    public int majorityElementSecondAlgo(int[] nums) {

        int candidate = nums[0];
        int count = 0;

        // find the best candidate - >
        for (int i = 1; i < nums.length; i++) {
            if (candidate == nums[i]) {
                count++;
            } else if (count == 0) {
                candidate = nums[i];
            } else {
                count--;
            }
        }

        //TODO - > here we can just return the candidate;

        // see how many times we see the candidate in the list - >
        count = 0;
        for (int num : nums) {
            if (candidate == num) {
                count++;
            }
        }

        // The majority element is the element that appears more than ⌊n / 2⌋ times. ->
        if (count > nums.length / 2) {
            return candidate;
        } else {
            return -1;
        }

        /* we can just return the candidate and never check it becasue int the text of the question it says that we must assume
         * that majority exists.
         *
         * this is Boyer-Moore Majority Vote Algorithm.
         * */
    }
}
