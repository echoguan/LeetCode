package com.echo;

import com.echo.leetcode.medium._22.GenerateParenthesesUsingBacktrack;
import com.echo.leetcode.medium._22.GenerateParenthesesUsingBacktrackAndStringBuilder;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> result = new GenerateParenthesesUsingBacktrackAndStringBuilder().generateParenthesis(3);
        System.out.println(result.toString());
    }
}
