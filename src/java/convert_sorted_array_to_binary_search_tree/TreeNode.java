/*
Given an integer array nums where the elements are sorted in ascending order, convert it to a
height-balanced
binary search tree.


Example 1:

python
Copy code
Input: nums = [1, 2, 3]
Corresponding Binary Search Tree:

  2
 / \
1   3

Example 2:

Input: nums = [1, 2, 3, 4, 5]
Corresponding Binary Search Tree:

    3
   / \
  2   4
 /     \
1       5

Example 3:

Input: nums = [-10, -3, 0, 5, 9]
Corresponding Binary Search Tree:

    0
   / \
 -3   9
 /   /
-10  5

* */


package src.java.convert_sorted_array_to_binary_search_tree;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
