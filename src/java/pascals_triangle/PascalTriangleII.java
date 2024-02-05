package src.java.pascals_triangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();

        for (int n = 0; n <= rowIndex; n++) {
            List<Integer> row = new ArrayList<>();
            long value = 1; // Starting with 1 as nC0 is always 1
            row.add((int) value);

            for (int k = 1; k <= n; k++) {
                value = value * (n - k + 1) / k; // Calculate next value in the row
                row.add((int) value);
            }
            pascalsTriangle.add(row);
        }

        return pascalsTriangle.get(rowIndex);
    }
}
