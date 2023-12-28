/*
* Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.



Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 3

Example 2:

Input: root = [1,null,2]
Output: 2


Constraints:

The number of nodes in the tree is in the range [0, 104].
-100 <= Node.val <= 100
*
* */

package src.java.maximum_depth_of_binary_tree;

import src.java.maximum_depth_of_binary_tree.TreeNode;

public class MaximumDepthOfBinaryTree {


    public int solution(TreeNode root) {
        // we must go inside if of tree from both side in same time and return the max value.
        // we do this for all the nodes in the tree and when we reach to the end we will return the values.
        if (root == null)
            return 0;

        // we will start from 1 !! this is not an array :)
        return Math.max(recursive(root.left, 1), recursive(root.right, 1));
    }

    public int recursive(TreeNode node, int depth) {
        int left = 0;
        int right = 0;

        if (node == null)
            return depth;

        // the depth + 1 vs depth ++ ->
        /**
         * The difference here is, the +1  expression adds 1 to the current value but does not modify the original value
         * but if we print the value depth+1 we will have the value of 2.
         * Fot the ++ is something different, if we use ++ we are changing the value  but there is problem here if we print
         * the value of depth ++ we do not have 2 we will have 1 !! why ? because this expression is the post increment
         * operator.
         * */
        left = recursive(node.left, depth + 1);
        right = recursive(node.right, depth + 1);

        return Math.max(left, right);
    }
}
