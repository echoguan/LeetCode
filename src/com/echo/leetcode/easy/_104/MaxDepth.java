package com.echo.leetcode.easy._104;

/**
 * Maximum Depth of Binary Tree
 * <p>
 * Tips:
 * 1. Time complexity: O(n)
 * 2. Space complexity: O(n)
 *
 * @author echo.guan
 */
public class MaxDepth {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return 1 + Math.max(left, right);
        }
    }
}
