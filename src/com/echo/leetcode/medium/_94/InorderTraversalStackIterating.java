package com.echo.leetcode.medium._94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Binary Tree Inorder Traversal using Stack iterating.
 * <p>
 * Tips:
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 *
 * @author echo.guan
 */
public class InorderTraversalStackIterating {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.empty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            result.add(curr.val);
            curr = curr.right;
        }
        return result;
    }
}
