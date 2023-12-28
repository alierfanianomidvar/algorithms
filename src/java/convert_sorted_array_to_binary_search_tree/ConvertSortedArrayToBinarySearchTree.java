package src.java.convert_sorted_array_to_binary_search_tree;

import java.util.Arrays;

public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode solution(int[] nums) {

        if (nums.length == 1) {  // when input is something like this - > [1]
            return new TreeNode(nums[0]);

        } else if (nums.length == 2) { // when input is something like  - > [1,3]
            return new TreeNode(nums[0]).right = new TreeNode(nums[1]);

        } else { // for more than 2 !
            /**
             * For solving this problem  first we need to look at the description of the problem
             * in the description we have a list of int as input, this list is sorted !! in ascending order.
             * base on this we now the root of  tree is the value that we have in the middle of the list.
             * For example if we have [-3,0,5] we can say the 0 is the root and 5 is the value right side of the tree and
             * -3 is the left side.
             *
             * so we will go throw the list and create and the tree for each side (left and right) and in the end we will
             * return the hole tree.
             *
             * Also, this way we are saying to put equal amount of nodes in the right and left side.
             * */

            TreeNode tree = new TreeNode();
            int middleIndex = nums.length / 2;  // Find the middle index

            tree.val = nums[middleIndex];
            // Divide the array into two halves
            int[] leftSide = Arrays.copyOfRange(nums, 0, middleIndex);
            int[] rightSide = Arrays.copyOfRange(nums, middleIndex + 1, nums.length);

            tree.left = recursive(leftSide, false);
            tree.right = recursive(rightSide, true);
        }
        return new TreeNode();
    }

    public TreeNode recursive(int[] nodes, boolean areWeInTheRightSide) {

        if (nodes.length < 2) // if the length is 1 we need just a node with that value.
            return new TreeNode(nodes[0]);


        TreeNode tree = new TreeNode();
        if (nodes.length == 2) {
            // if we are on the right side of the tree
            /**
             * For example the original list is [-10,-3,0,5,9], before calling the recursive function we know that
             * the 0 is the root of the main tree, and we are on the right side, we want to creat the right tree, so
             * the input list is [5,9], and we know that 5 is the root and when we are saying this we must put the 9 on the
             * right side to have balanced tree.
             * this is revers on the left side.
             * */
            tree.val = areWeInTheRightSide ? nodes[0] : nodes[1];
            if (areWeInTheRightSide)
                tree.right = new TreeNode(nodes[1]);
            else
                tree.left = new TreeNode(nodes[0]);


        } else {

            // same is the first time we called the recursive function.

            int middleIndex = nodes.length / 2;  // Find the middle index

            tree.val = nodes[middleIndex];
            // Divide the array into two halves
            int[] leftSide = Arrays.copyOfRange(nodes, 0, middleIndex);
            int[] rightSide = Arrays.copyOfRange(nodes, middleIndex + 1, nodes.length);

            tree.left = recursive(leftSide, false);
            tree.right = recursive(rightSide, true);
        }

        return tree;
    }
}
