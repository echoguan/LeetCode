package com.echo.leetcode.easy._412;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * This way you can add/delete mappings to/from to the hash map and not worry about changing the code.
 *
 * Tips:
 * 1. Time complexity: O(n)
 * 2. Space complexity: O(1)
 * - 不是 O(n)，因为result 是作为结果返回的，没有利用额外的空间，所以不计算在空间复杂度内。
 *
 * @author echo.guan
 */
public class FizzBuzzUsingHashMap {
    public List<String> fizzBuzz(int n) {
        if (n < 1) {
            return new ArrayList<>(0);
        }

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>(2) {{
            put(3, "Fizz");
            put(5, "Buzz");
        }};

        List<String> result = new ArrayList<>(n);
        StringBuilder str;

        for (int i = 1; i <= n; i++) {
            str = new StringBuilder();

            for (Integer k : map.keySet()) {
                if (i % k == 0) {
                    str.append(map.get(k));
                }
            }

            if (str.toString().equals("")) {
                str = new StringBuilder(String.valueOf(i));
            }

            result.add(str.toString());
        }

        return result;
    }
}
