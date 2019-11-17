package com.echo.leetcode.easy._189;

/**
 * Using Extra Array
 *
 * Tips:
 * 1. **当给数组赋值时，注意数组下标的范围。
 * 2. 时间复杂度：O(n)
 * 3. 空间复杂度：O(n)
 *
 * @author echo.guan
 * @date 2019/11/08
 */
public class RotateArrayUsingExtraArray {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int[] after = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            after[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(after, 0, nums, 0, after.length);
    }
}
