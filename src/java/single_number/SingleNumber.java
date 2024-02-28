package src.java.single_number;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.util.Collections.list;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        // the hashmap way - >
//        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();
//        for (int num : nums) {
//            if (!s.containsKey(num)) {
//                s.put(num,1);
//            } else {
//                s.remove(num);
//            }
//        }
//        for (Map.Entry<Integer, Integer> entry : s.entrySet()) {
//            // Since there's only one entry at this point, return its key directly.
//            return entry.getKey();
//        }
//        return 0;

        // xor - >
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }

        return 0;
    }
}
