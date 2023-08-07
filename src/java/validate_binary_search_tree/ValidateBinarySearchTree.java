package src.java.validate_binary_search_tree;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBSTHelper(TreeNode root, long minValue, long maxValue) {

        if (root == null) return true;
        else if (root.val <= minValue || root.val >= maxValue) return false;
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
