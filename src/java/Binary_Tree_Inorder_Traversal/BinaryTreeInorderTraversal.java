package src.java.Binary_Tree_Inorder_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        return r(root,output);
    }

    public List<Integer> r(TreeNode root, List<Integer> output) {

        if (root == null) {
            return output;
        }

        if(root.left != null){ // we got the left side until we reach the null
            r(root.left, output);
        }

        output.add(root.val); // we do not have any left, so we will save the root

        if( root.right != null){
            r(root.right,output); // After that we have the root we go to right side.
        }

        return output;
    }
}
