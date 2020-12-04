package com.echo.leetcode.medium._59;

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {

        int[][] result = new int[n][n];
        // 1: ->; 2: down; 3: <-; 4: up
        int direction = 1;
        int num = 1;
        int x = 0;
        int y = n - 1;
        int start = 0;
        int end = n - 1;

        while (num <= n * n) {
            if (direction == 1) {
                for (var i = start; i <= end; i++) {
                    result[x][i] = num;
                    num++;
                }
                x = n - 1 - x;
                start++;
            } else if (direction == 2) {
                for (var j = start; j <= end; j++) {
                    result[j][y] = num;
                    num++;
                }
                y = n - 1 - y;
                end--;
            } else if (direction == 3) {
                for (var i = end; i >= start; i--) {
                    result[x][i] = num;
                    num++;
                }
                x = n - x;
                end++;
            } else if (direction == 4) {
                for (var j = end; j >= start; j--) {
                    result[j][y] = num;
                    num++;
                }
                y = n - 2 - y;
                end--;
            }
            direction = direction == 4 ? 1 : direction + 1;
        }

        return result;
    }
}
