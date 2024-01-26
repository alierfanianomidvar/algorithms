package src.java.pascals_triangle;

import src.java.minimum_depth_of_binary_tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> solution(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();

        for (int n = 0; n < numRows; n++) {
            List<Integer> row = new ArrayList<>();
            int value = 1; // Starting with 1 as nC0 is always 1
            row.add(value);

            for (int k = 1; k <= n; k++) {
                value = value * (n - k + 1) / k; // Calculate next value in the row
                row.add(value);
            }

            pascalsTriangle.add(row);
        }

        return pascalsTriangle;
    }
}
