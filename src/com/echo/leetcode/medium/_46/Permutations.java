package com.echo.leetcode.medium._46;

import java.util.ArrayList;
import java.util.List;

/**
 * Permutations Using Backtrack 回溯法
 *
 * Tips:
 * - Space complexity: O(n)
 *
 * @author echo.guan
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
        } else {
            for (int num : nums) {
                if (tempList.contains(num)) continue;
                tempList.add(num);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
