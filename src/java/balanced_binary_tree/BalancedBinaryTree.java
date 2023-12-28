/**
 * Given a binary tree, determine if it is
 * height-balanced
 * .
 * Example 1:
 * <p>
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: root = [1,2,2,3,3,null,null,4,4]
 * Output: false
 * <p>
 * Example 3:
 * <p>
 * Input: root = []
 * Output: true
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 5000].
 * -104 <= Node.val <= 104
 */

package src.java.balanced_binary_tree;

public class BalancedBinaryTree {

    public boolean solution(TreeNode root) {
        return recursive(root, 0) != Integer.MAX_VALUE;
    }

    public int recursive(TreeNode node, int depthOfTree) {

        if (node == null) // If the node is null we will return the depth value, for first element if we will return 0.
            return depthOfTree;

        /*
        * For determining if a tree  is height-balanced, subtrees must be height-balanced
        * So we need to the check the left and right side.
        * */
        int depthOfRightSideOfTree = recursive(node.right, depthOfTree + 1);
        if (depthOfRightSideOfTree == Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        int depthOfLeftSideOfTree = recursive(node.left, depthOfTree + 1);
        if (depthOfLeftSideOfTree == Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        // if the subtree is balanced, we will send the max value between height of left and right,
        // so the upper root knows how deep the subtrees goes.
        return Math.abs(depthOfLeftSideOfTree - depthOfRightSideOfTree) > 1 ? Integer.MAX_VALUE
                : Math.max(depthOfLeftSideOfTree, depthOfRightSideOfTree);
    }

}
