package com.echo.leetcode.easy._198;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int temp;
        for (int i = 0; i < k; i++) {
            temp = nums[(i + k) % nums.length];
            nums[(i + k) % nums.length] = nums[i];
            nums[(i + k + k) % nums.length] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
