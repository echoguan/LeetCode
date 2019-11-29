package com.echo.leetcode.easy._136;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Find single number using list.
 * <p>
 * Tips:
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 *
 * @author echo.guan
 */
public class SingleNumberUsingList {

    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>(nums.length / 2 + 1);
        for (int num : nums) {
            if (list.contains(num)) {
                list.remove(Integer.valueOf(num));
            } else {
                list.add(num);
            }
        }

        return list.get(0);
    }
}
