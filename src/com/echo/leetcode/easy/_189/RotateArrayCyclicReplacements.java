package com.echo.leetcode.easy._189;

import java.util.Arrays;

/**
 * Using cyclic replacements
 *
 * Tips:
 * 1. Time complexity：O(n)
 * 2. Space complexity：O(1)
 *
 * @author echo.guan
 */
public class RotateArrayCyclicReplacements {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int prev = nums[start];
            int temp;
            int next = start;

            do {
                next = (next + k) % nums.length;
                temp = nums[next];
                nums[next] = prev;
                prev = temp;
                count++;
            } while (next != start);
        }

        System.out.println(Arrays.toString(nums));
    }
}
