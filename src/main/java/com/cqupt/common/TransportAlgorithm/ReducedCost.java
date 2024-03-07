package com.cqupt.common.TransportAlgorithm;

import java.util.Arrays;

/**
 * 计算检验数
 */
public class ReducedCost {

    public ReducedCost(int[][] cost, int[][] reducedCost, int[][] locationOfBasicVar) {
//        for (int i = 0; i < cost.length; i++) {
//            System.out.println(Arrays.toString(cost[i]));
//        }
        //行位势
        int[] rowPotential = new int[cost.length];
        Arrays.fill(rowPotential, Integer.MAX_VALUE);
//        System.out.println(locationOfBasicVar[0][0]);
        rowPotential[locationOfBasicVar[0][0]] = 0;
        //列位势
        int[] colPotential = new int[cost[0].length];
        Arrays.fill(colPotential, Integer.MAX_VALUE);
        //使基变量处检验数=0
        initializeReducedCost(reducedCost, locationOfBasicVar);
        //计算行列位势
        calculatePotential(cost, locationOfBasicVar, rowPotential, colPotential);
        //计算检验数
        calculateReducedCost(cost, rowPotential, colPotential, reducedCost, locationOfBasicVar);
        //打印检验数
        WriteTableOfRC(reducedCost);


    }

    /**
     * 基变量处检验数=0
     *
     * @param reducedCost        检验数
     * @param locationOfBasicVar 基变量位置
     */
    private void initializeReducedCost(int[][] reducedCost, int[][] locationOfBasicVar) {

        for (int[] ints : locationOfBasicVar) {
            int i = ints[0];
            int j = ints[1];
            reducedCost[i][j] = 0;
        }
    }

    /**
     * 计算行位势、列位势
     *
     * @param cost               运输单价矩阵
     * @param locationOfBasicVar 基变量位置
     * @param rowPotential       行位势
     * @param colPotential       列位势
     */
    private void calculatePotential(int[][] cost, int[][] locationOfBasicVar,
                                    int[] rowPotential, int[] colPotential) {
        //只要行/列位势未Integer.Max_Value则迭代求解行、列位势
        while (UtilMeth.max(rowPotential) == Integer.MAX_VALUE ||
                UtilMeth.max(colPotential) == Integer.MAX_VALUE) {
            for (int[] ints : locationOfBasicVar) {
                int i = ints[0];
                int j = ints[1];
                //求行位势
                if (colPotential[j] != Integer.MAX_VALUE)
                    rowPotential[i] = cost[i][j] - colPotential[j];
                //求列位势
                if (rowPotential[i] != Integer.MAX_VALUE)
                    colPotential[j] = cost[i][j] - rowPotential[i];
            }
        }
    }

    private void calculateReducedCost(int[][] cost, int[] rowPotential, int[] colPotential, int[][] reducedCost, int[][] locationOfBasicVar) {
        for (int i = 0; i < reducedCost.length; i++) {
            for (int j = 0; j < reducedCost[i].length; j++) {
                for (int[] ints : locationOfBasicVar) {
                    if (i == ints[0] && j == ints[1]) break;
                    reducedCost[i][j] = cost[i][j] - (rowPotential[i] + colPotential[j]);
                }
            }
        }
    }

    /**
     * @param rc 打印检验数rc
     */
    private void WriteTableOfRC(int[][] rc) {
        System.out.println("\nreduced cost: ");
        for (int[] ints : rc) System.out.println(Arrays.toString(ints));
    }
}
