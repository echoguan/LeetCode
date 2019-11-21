package com.echo.leetcode.easy._344;

import java.util.Arrays;

/**
 * Tips:
 * 1. Time complexity：O(n)
 * 2. Space complexity：O(1)
 *
 * @author echo.guan
 */
public class ReverseString {

    public void reverseString(char[] s) {
        if (s == null) {
            return;
        }
        char temp;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(s));
    }
}
