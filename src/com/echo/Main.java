package com.echo;

import com.echo.leetcode.medium._22.GenerateParentheses;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> result = new GenerateParentheses().generateParenthesis(3);
        System.out.println(result.toString());
    }
}
