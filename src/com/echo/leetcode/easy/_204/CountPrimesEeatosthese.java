package com.echo.leetcode.easy._204;

/**
 * 题目：204. 计数质数（统计所有小于非负整数 n 的质数的数量）
 * 思路：厄拉多塞筛法（Sieve of Eeatosthese）
 * <p>
 * 思路详解：https://echoguan.coding.me/2019/05/24/Count-Primes-Sieve-of-Eeatosthese/
 *
 * @author echo.guan
 * @date 2019/05/23
 */
public class CountPrimesEeatosthese {

    public int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }

        Boolean[] num = new Boolean[n];

        // 排除非质数，置为 false
        for (int i = 2; i * i < n; i++) {
            if (num[i] == null) {
                for (int j = 2; j * i < n; j++) {
                    num[j * i] = false;
                }
            }
        }

        // 计算数量
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (num[i] == null) {
                count++;
            }
        }

        return count;
    }
}
