package com.echo.leetcode.easy._136;

import java.util.Arrays;

/**
 * Find single number using sort.
 * <p>
 * Tips:
 * - Time complexity: O(n log(n))
 * - Space complexity: O(1)
 *
 * @author echo.guan
 */
public class SingleNumberUsingSort {

    public int singleNumber(int[] nums) {
        // JDK using DualPivotQuicksort, and it offers O(n log(n)) performance
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }
}
