package com.echo.leetcode.medium._238;

/**
 * Product of array except self
 *
 * Tips:
 * - Time complexity: O(n)
 * - Space complexity: O(2n)
 *
 * @author echo.guan
 */
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            left[i] = 1;
            if (i - 1 >= 0) {
                left[i] = nums[i - 1] * left[i - 1];
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            right[i] = 1;
            if (i + 1 < nums.length) {
                right[i] = nums[i + 1] * right[i + 1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            output[i] = right[i] * left[i];
        }

        return output;
    }
}
