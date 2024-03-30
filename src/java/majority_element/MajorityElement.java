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


}
