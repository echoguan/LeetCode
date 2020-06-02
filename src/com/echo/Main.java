package com.echo;

import com.echo.leetcode.easy._350.IntersectionUsingHashMap;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        System.out.println(Arrays.toString(new IntersectionUsingHashMap().intersectionOfArrays(nums1, nums2)));
    }
}
