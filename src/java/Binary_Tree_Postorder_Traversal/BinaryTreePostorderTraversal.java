package src.java.Binary_Tree_Postorder_Traversal;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> elements = new LinkedList<>();

        preorderTraversal(root, elements);
        return elements;
    }

    public static void preorderTraversal(TreeNode root, List<Integer> elements) {
        if (root == null) return;
        preorderTraversal(root.left, elements); // Traverse left subtree
        preorderTraversal(root.right, elements); // Traverse right subtree
        elements.add(root.val); // Visit the root - > in the post order last thing we need to the put in the list is the root
    }

    public static void iteratively(TreeNode root, List<Integer> elements) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();

        if (root.left != null) {
            stack.push(root.left);
        } else if (root.right != null) {
            stack.push(root.right);
        } else {
            stack.push(root);
        }
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
