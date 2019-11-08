package com.echo.leetcode.easy._198;

/**
 * Brute Force [Time Limit Exceeded]
 *
 * Tips:
 * 1. 第一步：验证参数
 * 2. 时间复杂度：O(n*k)
 * 3. 空间复杂度：O(1)
 *
 * @author echo.guan
 * @date 2019/11/07
 */
public class RotateArrayBruteForce {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }
}
