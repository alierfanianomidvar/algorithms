/*
* Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.



Example 1:
Input: p = [1,2,3], q = [1,2,3]
Output: true
*
Example 2:
Input: p = [1,2], q = [1,null,2]
Output: false
*
Example 3:

Input: p = [1,2,1], q = [1,1,2]
Output: false
*
Constraints:

The number of nodes in both trees is in the range [0, 100].
-104 <= Node.val <= 104
* */

package src.java.same_tree;

public class SameTree {

    public boolean solution(TreeNode p, TreeNode q) {

        if (p == null && q == null) { // if they both are null we are ok.
            return true;
        }
        if (p == null || q == null || p.val != q.val) { // if one of them are null or the value is not equal return false.
            return false;
        }
        return solution(p.left,q.left) && solution(p.right,q.right); // go to the next level
    }

}
