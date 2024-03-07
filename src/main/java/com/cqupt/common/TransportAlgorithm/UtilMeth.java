package com.cqupt.common.TransportAlgorithm;

import java.util.Arrays;

public class UtilMeth {
    /**
     * @param array 一维数组
     * @return 一维数组的最小元素
     */
    public static int min(int[] array) {
        return Arrays.stream(array).min().getAsInt();
    }

    /**
     * @param array 一维数组
     * @return maximum element of an array
     */
    public static int max(int[] array) {
        return Arrays.stream(array).max().getAsInt();
    }

    /**
     * @param array 二维数组
     * @return 二维数组的最小元素
     */
    public static int min(int[][] array) {
        int min = Integer.MAX_VALUE;
        for (int[] ints : array) {
            if (Arrays.stream(ints).min().getAsInt() < min) {
                min = Arrays.stream(ints).min().getAsInt();
            }
        }
        return min;
    }

    /**
     * @param array 二维数组
     * @param min   二维数组的最小元素
     * @return 索引
     */
    public static int[] index(int[][] array, int min) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min == array[i][j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    /**
     * @param array 一维数组
     * @return 数组求和
     */
    public static int sum(int[] array) {
        return Arrays.stream(array).sum();
    }
}
