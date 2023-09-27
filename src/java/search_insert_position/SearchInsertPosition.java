package src.java.search_insert_position;

public class SearchInsertPosition {

    public int solution(int[] nums, int target) {

        int size = nums.length;
        if( target > nums[size-1]){
            return size;
        } else {
            for (int i = 0; i < size; i++) {
                 if(nums[i]> target){
                     return i-1;
                 } else if( nums[i] == target){
                     return i;
                 }
            }
            return size;
        }
    }
}
