package src.java.contains_duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> visited = new HashSet<>();

        for (int num : nums) {
            if(visited.contains(num)){
                return true;
            } else {
                visited.add(num);
            }
        }

        return false;
    }
}
