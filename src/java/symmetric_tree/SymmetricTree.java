/*
*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).



Example 1:
Input: root = [1,2,2,3,4,4,3]
Output: true
Example 2:
Input: root = [1,2,2,null,3,null,3]
Output: false


Constraints:

The number of nodes in the tree is in the range [1, 1000].
-100 <= Node.val <= 100
*


* */
//TODO Follow up: Could you solve it both recursively and iteratively?

package src.java.symmetric_tree;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

    public boolean solution(TreeNode root) {

        return recursive(root.left, root.right);
    }

    public boolean recursive(TreeNode left, TreeNode right){

        if(left == null && right == null) // If the left and the right side are null, we will return true.
            return true;

        if(left == null || right== null || left.val != right.val)
            // If the left or the right side is null, or they do not have same value
            // we will return false.
            return false;


        // the far left side must be same as the far right and right side of left :) and left side of right must be same.
        return recursive(left.left, right.right) && recursive(left.right, right.left);
    }

    public boolean iterative(TreeNode node){
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(node.left);
        queue.add(node.right);

        while (!queue.isEmpty()){
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();

            if(node1 == null && node2 == null)
                continue;
            else if(node1 == null || node2 == null || node1.val != node2.val)
                return false;

            queue.add(node1.left);
            queue.add(node2.right);
            queue.add(node1.right);
            queue.add(node2.left);
        }
        return true;
    }
}
