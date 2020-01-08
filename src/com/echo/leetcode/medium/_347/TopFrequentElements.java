package com.echo.leetcode.medium._347;

import java.util.*;

/**
 * Top K Frequent Elements Using PriorityQueen
 * - Time complexity: O(n)
 * - Space complexity: O(2n)
 *
 * @author echo guan
 */
public class TopFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>(k);
        Map<Integer, Integer> count = new HashMap<>();
        for (int item : nums) {
            count.put(item, count.getOrDefault(item, 0) + 1);
        }

        Queue<Integer> q = new PriorityQueue<>((n1, n2) -> count.get(n2) - count.get(n1));
        for (int n : count.keySet()) {
            q.offer(n);
        }

        for (int i = 0; i < k; i++) {
            result.add(q.poll());
        }

        return result;
    }
}
