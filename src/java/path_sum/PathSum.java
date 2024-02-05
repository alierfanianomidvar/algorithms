package src.java.path_sum;


import java.util.ArrayList;
import java.util.List;

public class PathSum {

    public boolean solution(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        boolean rightSide = false;
        boolean leftSide = false;

        if (root.right == null && root.left == null) {
            return root.val == targetSum;
        }

        if(root.right != null){
            rightSide = r(root.right, root.val, targetSum);
        }

        if(root.left != null){
            leftSide = r(root.left, root.val, targetSum);
        }

        return  rightSide || leftSide;
    }

    public boolean r(TreeNode root, int nodeValue, int targetSum) {

        boolean rightSide = false;
        boolean leftSide = false;
        nodeValue += root.val;

        if (root.right == null && root.left == null) {
            return nodeValue == targetSum;
        }

        if(root.right != null){
            rightSide = r(root.right, nodeValue, targetSum);
        }

        if(root.left != null){
            leftSide = r(root.left, nodeValue, targetSum);
        }

        return rightSide || leftSide;
    }

}
