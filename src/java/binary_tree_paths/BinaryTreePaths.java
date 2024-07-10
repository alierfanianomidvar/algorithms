package src.java.binary_tree_paths;

import src.java.binary_tree_paths.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    public List<String> solution(TreeNode root) {

        return r(root, new ArrayList<String>(), new StringBuilder());
    }

    private List<String> r(TreeNode root, final List<String> output, final StringBuilder path) {

        final int tmp = path.length();

        if (root.left == null && root.right == null) {
            path.append(root.val);
            output.add(path.toString());
        } else {
            path.append(root.val);
            path.append("->");

            if (root.left != null) {
                r(root.left, output, path);
            }
            if (root.right != null) {
                r(root.right, output, path);
            }

        }

        path.setLength(path.length() - (path.length() - tmp));

        return output;

    }
}
