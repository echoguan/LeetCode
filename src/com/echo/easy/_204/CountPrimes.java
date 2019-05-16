package com.echo.easy._204;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目：204. 计数质数（统计所有小于非负整数 n 的质数的数量）
 * - 质数概念：又称素数，指在大于 1 的自然数中，除了1和该数自身外，无法被其他自然数整除的数。
 * - 判断质数思路：遍历数字 n 是否能被从 2 到 sqrt(n) 之间的质数整除。
 * <p>
 * Tips:
 * 1. 边界值判断
 * 2. 0、1都不是质数
 * 3. 测试用例：-100(0), -1(0), 0(0), 1(0), 2(0), 3(1), 10(4), 100(25), 102(26), 10000(1229), 1500000(114155), 2147483647
 * 4. 性能优化
 * - List指定初始容量，减少扩容次数，提高性能。
 *
 * @author echo
 * @date 2019/05/14
 */
public class CountPrimes {
    private static final int MIN_PRIME = 2;

    public int countPrimes(int n) {
        // 因为题目是统计小于 n 的质数的数量 => 即为统计小于等于 target 的
        int target = n - 1;

        // 初始化结果时，把最小质数 2 包含在内
        int num = 1;

        // 初始化一个集合，初始值包含最小质数 2
        List<Integer> primes = new ArrayList<>(1000000);
        primes.add(MIN_PRIME);

        // 小于2的数都不是质数
        if (target < MIN_PRIME) {
            return 0;
        }

        // 从 3 开始判断
        for (int i = 3; i <= target; i++) {
            if (isPrime(i, primes)) {
                primes.add(i);
                num++;
            }
        }

        return num;
    }

    private boolean isPrime(int m, List<Integer> primes) {
        boolean result = false;
        double max = Math.floor(Math.sqrt(m));

        for (int i = 0; i < primes.size(); i++) {
            int prime = primes.get(i);

            if (prime <= max) {
                if (m % prime == 0) {
                    break;
                }
            } else {
                result = true;
                break;
            }
        }

        return result;
    }

}
