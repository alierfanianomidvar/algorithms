package src.java.maximum_depth_of_binary_tree;

import src.java.maximum_depth_of_binary_tree.TreeNode;

public class MaximumDepthOfBinaryTree {


    public int solution(TreeNode root) {

        return  Math.max(recursive(root.left, 0), recursive(root.right, 0));
    }

    public int recursive(TreeNode node, int depth) {
        int left = 0;
        int right = 0;

        if (node == null)
            return depth--;

        if (node.left != null) {
            left = recursive(node.left, depth++);
        } else {
            right = recursive(node.right, depth++);
        }

        return Math.max(left, right);
    }
}
