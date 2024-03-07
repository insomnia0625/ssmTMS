package com.cqupt.common.TransportAlgorithm;

import lombok.Data;

import java.util.Arrays;

/**
 * 最小元素法获得初始解
 */
@Data
public class initialAlgori {
    //存放基变量位置
    private int[][] basicVar;

    public initialAlgori(int[][] cost, int[] supply, int[] demand, int[][] initialSolution) {
        //存放基变量位置
        basicVar = new int[supply.length + demand.length - 1][2];

        initialSolution(cost, supply, demand, initialSolution);
    }

    public void initialSolution(int[][] cost, int[] supply, int[] demand, int[][] initialSolution) {
        int counter = 0;
        //若行和列未全部划掉，迭代使用最小元素法分配运量
        while (UtilMeth.sum(supply) != 0 && UtilMeth.sum(demand) != 0) {

            //选择最小运价
            int minCost = minCost(cost);////priblem
            int[] index = getIndex(cost, minCost);
            basicVar[counter][0] = index[0];
            basicVar[counter][1] = index[1];
            //分配运量
            assighVolume(cost, index, supply, demand, initialSolution);
            counter++;
        }

        //打印初始调运方案
        wirteInitialSolution(initialSolution);

    }

    /**
     * @param freight 运价表
     * @return 最小运价
     */
    private int minCost(int[][] freight) {
        return UtilMeth.min(freight);
    }

    /**
     * @param freight 运价表
     * @param ele     最小运价
     * @return 最小运价索引
     */
    private int[] getIndex(int[][] freight, int ele) {
        return UtilMeth.index(freight, ele);
    }

    private void assighVolume(int[][] freight, int[] index, int[] supply, int[] demand, int[][] volumeTable) {
        int i = index[0];
        int j = index[1];

        //分配运量
        volumeTable[i][j] = Math.min(supply[i], demand[j]);

        //划去行或列
        if (volumeTable[i][j] == supply[i])
            Arrays.fill(freight[i], Integer.MAX_VALUE);
        else
            for (int k = 0; k < freight.length; k++) freight[k][j] = Integer.MAX_VALUE;

        //更新销量和产量
        supply[i] = supply[i] - volumeTable[i][j];
        demand[j] = demand[j] - volumeTable[i][j];

    }

    /**
     * @param initialSolution 由最小元素法得到的调运方案
     */
    private void wirteInitialSolution(int[][] initialSolution) {

        System.out.println("初始解：");
        for (int[] ints : initialSolution) {
            System.out.println(Arrays.toString(ints));
        }
    }

    private void isDegeneration() {

    }
}
