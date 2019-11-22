package com.echo.leetcode.easy._912;

import com.echo.sort.BubbleSort;

import java.util.ArrayList;
import java.util.List;

/**
 * Sort array using multiple methods.
 *
 * @author echo.guan
 */
public class SortArray {

    public List<Integer> sortArray(int[] nums) {
        // Bubble sort time complexity is too high
        nums = new BubbleSort().sort(nums);

        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            result.add(num);
        }

        return result;
    }
}
