package com.echo.leetcode.medium._22;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return null;
        }
        List<String> result = new ArrayList<>();
        backtrack(result, "", n, 0, 0);
        return result;
    }

    private void backtrack(List<String> result, String temp, int n, int open, int close) {
        if (temp.length() == n * 2) {
            result.add(temp.toString());
            return;
        }
        if (open < n) {
            backtrack(result, temp+"(", n, open + 1, close);
        }
        if (close < open) {
            backtrack(result, temp+")", n, open, close + 1);
        }
    }
}
