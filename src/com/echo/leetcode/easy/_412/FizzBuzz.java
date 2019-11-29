package com.echo.leetcode.easy._412;

import java.util.ArrayList;
import java.util.List;

/**
 * Tips:
 * 1. Time complexity: O(n)
 * 2. Space complexity: O(1)
 * - 不是 O(n)，因为result 是作为结果返回的，没有利用额外的空间，所以不计算在空间复杂度内。
 *
 * @author echo.guan
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        if (n < 1) {
            return new ArrayList<>(0);
        }

        List<String> result = new ArrayList<>(n);
        String str;

        for (int i = 1; i <= n; i++) {
            str = "";
            if (i % 3 == 0) {
                str += "Fizz";
            }
            if (i % 5 == 0) {
                str += "Buzz";
            }
            if (str.equals("")) {
                str = String.valueOf(i);
            }
            result.add(str);
        }

        return result;
    }
}
