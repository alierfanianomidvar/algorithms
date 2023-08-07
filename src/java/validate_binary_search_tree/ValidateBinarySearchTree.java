/**
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 *
 * A valid BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 *
 * Example 1:
 *   2
 * 1   3
 *
 * Input: root = [2,1,3]
 * Output: true
 *
 * Example 2:
 *   5
 * 1     4
 *     3   6
 *
 * Input: root = [5,1,4,null,null,3,6]
 * Output: false
 * Explanation: The root node's value is 5 but its right child's value is 4.
 *
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [1, 104].
 * -231 <= Node.val <= 231 - 1
 * */


package src.java.validate_binary_search_tree;

public class ValidateBinarySearchTree {

    /*
    Base on what we know BST tree is valid when all the node in the left be smaller that the root node and
    all the node on the right side be larger than the root node. So we need to have the value of the root node with use,
    for this reason we will create a helper function.
    */
    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBSTHelper(TreeNode root, long minValue, long maxValue) {

        if (root == null) return true; // When we reach to the leaf node we need to return true.
        else if (root.val <= minValue || root.val >= maxValue) return false;  // Why this ?!
        /*
        As we said we need all node in the left must be smaller than root and all node the in right must be bigger than
        root, so when we send the left node to this function we know that this node must be smaller than the root, so we send
        the root value as max value to this function. If node is bigger than max value it means that the left node is bigger
        than the root so this is false(This is not a valid BST tree.)
        */
        return isValidBSTHelper(
                root.left,
                minValue,
                root.val)
                &&
                isValidBSTHelper(
                        root.right,
                        root.val,
                        maxValue);
    }
}
