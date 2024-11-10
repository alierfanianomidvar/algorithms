package src.java.count_complete_tree_nodes;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class CountCompleteTreeNodes {

    public int solution(TreeNode root) {
        return countNodesR(root);
    }

    // Function to compute the height of the tree
    private int computeHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            node = node.left;
            height++;
        }
        return height;
    }

    // Function to count the nodes in the complete binary tree
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = computeHeight(root.left);
        int rightHeight = computeHeight(root.right);

        if (leftHeight == rightHeight) {
            // Left subtree is complete
            return (1 << leftHeight) + countNodes(root.right);
        } else {
            // Right subtree is complete
            return (1 << rightHeight) + countNodes(root.left);
        }
    }
}
