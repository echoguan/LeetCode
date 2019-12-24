package com.echo.leetcode.medium._22;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesesUsingBacktrackAndStringBuilder {

    public List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return null;
        }
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), n, 0, 0);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder temp, int num, int open, int close) {
        if (temp.length() == num * 2) {
            result.add(temp.toString());
            return;
        }

        if (open < num) {
            temp.append("(");
            backtrack(result, temp, num, open + 1, close);
            temp.deleteCharAt(temp.length() - 1);
        }
        if (close < open) {
            temp.append(")");
            backtrack(result, temp, num, open, close + 1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
