package com.echo.leetcode.easy._189;

import java.util.Arrays;

/**
 * Using reverse
 *
 * Tips:
 * 1. Time complexity：O(n)
 * 2. Space complexity：O(1)
 *
 * @author echo.guan
 */
public class RotateArrayReverse {

    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }

        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

    private void reverse(int[] array, int start, int end) {
        if (start >= 0 && end > 0 && start < end) {
            int temp;
            while (start < end) {
                temp = array[end];
                array[end] = array[start];
                array[start] = temp;
                start++;
                end--;
            }
        }
    }
}
