package src.java.binary_tree_preorder_traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> elements = new LinkedList<>();

        iteratively(root, elements);
        return elements;
    }

    public static void preorderTraversal(TreeNode root, List<Integer> elements) {
        if (root == null) return;
        elements.add(root.val); // Visit the root
        preorderTraversal(root.left, elements); // Traverse left subtree
        preorderTraversal(root.right, elements); // Traverse right subtree
    }

    public static void iteratively(TreeNode root, List<Integer> elements) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode treeNode = stack.pop();
            elements.add(treeNode.val);

            if (treeNode.right != null) {
                stack.push(treeNode.right);
            }

            if (treeNode.left != null) {
                stack.push(treeNode.left);
            }
        }
    }

}
