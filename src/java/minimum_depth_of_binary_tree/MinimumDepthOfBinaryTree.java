/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.



Example 1:

Input: root = [3,9,20,null,null,15,7]
Output: 2

Example 2:

Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5


Constraints:

The number of nodes in the tree is in the range [0, 105].
-1000 <= Node.val <= 1000

* */

package src.java.minimum_depth_of_binary_tree;

public class MinimumDepthOfBinaryTree {

    public int solution(TreeNode root) {

        if (root == null)
            return 0;

        int depth = recursive(root, 0);

        int minimumDepthOfBinaryTree = depth * 2;

        return depth % 2 != 0 ? minimumDepthOfBinaryTree : minimumDepthOfBinaryTree - 1;
    }

    public int recursive(TreeNode node, int depthOfTree) {

        int depthOfRightSideOfTree = Integer.MAX_VALUE;
        int depthOfLeftSideOfTree = Integer.MAX_VALUE;

        if(node.right != null)
            depthOfRightSideOfTree = recursive(node.right, depthOfTree + 1);

        if (node.left != null)
            depthOfLeftSideOfTree = recursive(node.left, depthOfTree + 1);

        if (node.right == null && node.left == null)
            return depthOfTree;

        return Math.min(depthOfLeftSideOfTree, depthOfRightSideOfTree);
    }
}
