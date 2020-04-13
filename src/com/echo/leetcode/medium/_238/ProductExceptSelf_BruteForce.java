package com.echo.leetcode.medium._238;

/**
 * Product of array except self Using brute force [Deprecated]
 *
 * Tips:
 * - Time complexity: O(n^2)
 * - Space complexity: O(1)
 *
 * @author echo.guan
 */
public class ProductExceptSelf_BruteForce {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    output[i] *= nums[j];
                }
            }
        }
        return output;
    }
}
