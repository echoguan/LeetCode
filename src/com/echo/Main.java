package com.echo;

import com.echo.sort.BubbleSort;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] source = {1, 1, 2, 0, 9, 3, -12, 7, 8, 3, 4, 65, -22};
        int[] num = bubbleSort.sort(source);
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}
