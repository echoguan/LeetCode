package com.echo.leetcode.easy._350;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Tips:
 * 1. Time complexity：O(n)
 * 2. Space complexity：O(n)
 *
 * @author echo.guan
 */
public class IntersectionUsingHashMap {
    public int[] intersectionOfArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[]{};
        }

        // In order to use the small array to record HashMap.
        if (nums1.length > nums2.length) {
            return intersectionOfArrays(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<>(nums1.length);
        for (int value : nums1) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        int j = 0;
        for (int value : nums2) {
            int count = map.getOrDefault(value, 0);
            if (count > 0) {
                nums1[j] = value;
                j++;
                map.put(value, count - 1);
            }
        }

        return Arrays.copyOfRange(nums1, 0, j);
    }
}
