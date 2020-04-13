package com.echo;

import com.echo.leetcode.medium._238.ProductExceptSelf;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(new ProductExceptSelf().productExceptSelf(nums)));
    }
}
