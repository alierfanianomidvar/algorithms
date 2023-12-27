package src.java.convert_sorted_array_to_binary_search_tree;

import java.util.Arrays;

public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode solution(int[] nums) {
        if( nums.length == 1){
            return new TreeNode(nums[0]);
        } else if( nums.length == 2){
            return new TreeNode(nums[0]).right = new TreeNode(nums[1]);
        } else {
            TreeNode tree = new TreeNode();
            int middleIndex = nums.length / 2;  // Find the middle index

            tree.val = nums[middleIndex];
            // Divide the array into two halves
            int[] leftSide = Arrays.copyOfRange(nums, 0, middleIndex);
            int[] rightSide = Arrays.copyOfRange(nums, middleIndex + 1, nums.length);

            tree.left = recursive(leftSide, false);
            tree.right= recursive(rightSide, true);
        }
        return new TreeNode();
    }

    public TreeNode recursive(int[] nodes, boolean areWeInTheRightSide) {

        if (nodes.length < 2)
            return new TreeNode(nodes[0]);
        TreeNode tree = new TreeNode();

        if(nodes.length == 2){
            tree.val = areWeInTheRightSide ? nodes[0] : nodes[1];
            if(areWeInTheRightSide)
                tree.right = new TreeNode(nodes[1]);
            else
                tree.left = new TreeNode(nodes[0]);
        } else {

            int middleIndex = nodes.length / 2;  // Find the middle index

            tree.val = nodes[middleIndex];
            // Divide the array into two halves
            int[] leftSide = Arrays.copyOfRange(nodes, 0, middleIndex);
            int[] rightSide = Arrays.copyOfRange(nodes, middleIndex + 1, nodes.length);

            tree.left = recursive(leftSide, false);
            tree.right= recursive(rightSide, true);
        }

        return tree;
    }
}
