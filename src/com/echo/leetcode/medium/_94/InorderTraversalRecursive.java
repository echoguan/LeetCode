package com.echo.leetcode.medium._94;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Tree Inorder Traversal using recursive approach.
 * <p>
 * Tips:
 * - pre order: root-left-right
 * - in-order: left-root-right
 * - post-order: left-right-root
 * <p>
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 *
 * @author echo.guan
 */
public class InorderTraversalRecursive {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        getValue(root, result);
        return result;
    }

    private void getValue(TreeNode root, List<Integer> result) {
        if (root != null) {
            if (root.left != null) {
                getValue(root.left, result);
            }
            result.add(root.val);
            if (root.right != null) {
                getValue(root.right, result);
            }
        }
    }
}
