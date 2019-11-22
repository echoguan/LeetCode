package com.echo.leetcode.easy._136;

/**
 * Find single Number Using Bit manipulation
 * <p>
 * Solution:
 * 1. The A XOR B operation is equivalent to (A AND !B) OR (!A AND B)
 * 2. 恒等律：p ^ 0 = p
 * 3. 归零律：p ^ q = 0
 * 4. 自反：p ^ q ^ p = 0 ^ q = q
 * <p>
 * Tips:
 * 1. Time complexity: O(n)
 * 2. Space complexity: O(1)
 *
 * @author echo.guan
 */
public class SingleNumberUsingXOR {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
