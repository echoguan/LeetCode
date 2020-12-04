package com.echo.customize;

/**
 * Below is 5*5 spiral matrix, please try to write a program, print 5*5 matrix with Clockwise sequence.
 * Think use n to replace 5, what needs to change in program.
 * 1       2      3      4       5
 * 16      17     18     19      6
 * 15      24     25     20 	 7
 * 14      23     22     21 	 8
 * 13      12     11     10 	 9
 * <p>
 * Tips:
 * Time complexity: O(n*n)
 * Space complexity: O(1)
 */
public class SpiralMatrix {

    public void printClockWise(int n) {
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

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n; j++) {
                System.out.print(result[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
