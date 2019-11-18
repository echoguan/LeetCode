package com.echo.leetcode.easy._189;

import java.util.Arrays;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }

        k %= nums.length;
        reverse(nums, nums.length);
        reverse(nums, k);
        reverse(nums, -(nums.length - k));

        System.out.println(Arrays.toString(nums));
    }

    private void reverse(int[] array, int length) {
        int temp;
        int count = 0;

        if (length > 0) {
            for (int i = 0; count < length / 2; i++) {
                temp = array[length - 1 - count];
                array[length - 1 - count] = array[i];
                array[i] = temp;
                count++;
            }
        } else {
            length = -length;
            for (int i = array.length - 1; count < length / 2; i--) {
                temp = array[array.length - length + count];
                array[array.length - length + count] = array[i];
                array[i] = temp;
                count++;
            }
        }
    }
}
