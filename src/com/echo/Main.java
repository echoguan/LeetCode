package com.echo;

import com.echo.leetcode.medium._347.TopFrequentElements;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 2, 2, 2, 1, 1, 1, 3};
        System.out.println(new TopFrequentElements().topKFrequent(nums, 2));
    }
}
