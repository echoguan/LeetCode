package com.echo.sort;

/**
 * 冒泡排序（从小到大排）
 * <p>
 * 测试用例：{1, 1, 2, 0, 9, 3, -12, 7, 8, 3, 4, 65, -22},
 * <p>
 * Tips:
 * - 优化 *1：设置标注位（如果对于一个本身有序的序列，或序列后面一大部分都是有序的序列，不设置标志位就会浪费很多开销）
 * - Time complexity: O(n^2)
 * - Space complexity: O(1)
 *
 * @author echo.guan
 * @date 2019/05/17
 */
public class BubbleSort {

    public int[] sort(int[] nums) {
        int temp;

        // 要重复排序次数 length-1
        for (int i = 0; i < nums.length - 1; i++) {
            // *1 设置标志位，一旦出现一次内层循环并没有把标志位置为 false，则说明排序已完毕，直接跳出外层循环。
            boolean flag = true;

            // 每一次排序的循环
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] < nums[j - 1]) {
                    temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    flag = false;
                }
            }

            if (flag) {
                break;
            }
        }

        return nums;
    }
}
