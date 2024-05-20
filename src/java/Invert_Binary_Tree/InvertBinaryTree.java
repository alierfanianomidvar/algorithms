package src.java.Invert_Binary_Tree;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Swap the left and right children
        TreeNode temp = root.left; // we first the change the left side, so we need to save the left side of the problem.
        root.left = invertTree(root.right);
        root.right = invertTree(temp); // then we are swapping the right side.

        return root;
    }
}
