package com.cqupt.common.TransportAlgorithm;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/**
 * 改进闭合回路法调整检验数<0处的解
 */
public class ImprovedClosedLoop {
    //检验数
    private final int[][] reducedCost;
    //行长度
    int rowLen;
    //列长度
    int colLen;

    DepthFirstSearch dfs;

    public ImprovedClosedLoop(int[][] reducedCost) {
        this.reducedCost = reducedCost;
        this.rowLen = reducedCost.length;
        this.colLen = reducedCost[0].length;
    }

    public int[][] optimize(int[][] initialSolution) {
        int[][] optimalSolution = new int[rowLen][colLen];
        for (int i = 0; i < rowLen; i++) {
            optimalSolution[i] = Arrays.copyOf(initialSolution[i], colLen);
        }
        //构建邻接矩阵
        int[][] adjacency = adjacencyMatrix();
        //寻找闭合回路
        Map<Integer, Integer> cycle = findClosedLoop(adjacency);
        System.out.println(cycle);

        //闭合回路中最小运量
//        System.out.println(cycle.keySet());
        int adjustment = getAdjustmentAmount(cycle, initialSolution);
        System.out.printf("\n调整运量：%s\n", adjustment);

        //调整运量
        for (Map.Entry<Integer, Integer> entry : cycle.entrySet()) {
//            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            int key = entry.getKey();
            int value = entry.getValue();
            int x = key / colLen;
            int y = key % colLen;
            if (value % 2 == 0) optimalSolution[x][y] = optimalSolution[x][y] - adjustment;
            else optimalSolution[x][y] = optimalSolution[x][y] + adjustment;
        }

        return optimalSolution;
    }

    /**
     * @param cycle           闭合回路
     * @param initialSolution 最小元素法求解获得的初始运量表
     * @return 最小运量调整
     */
    private int getAdjustmentAmount(Map<Integer, Integer> cycle, int[][] initialSolution) {
        Set<Integer> node = cycle.keySet();
        int minimum = Integer.MAX_VALUE;
        for (Integer n : node) {
            if (n.equals(node.iterator().next())) continue;
            int x = n / colLen;
            int y = n % colLen;
            if (minimum > initialSolution[x][y]) minimum = initialSolution[x][y];
        }
        return minimum;
    }

    /**
     * @param adjacency adjacent matrix
     * @return cycle
     */
    private Map<Integer, Integer> findClosedLoop(int[][] adjacency) {
        int basicVar = getEnteringVar();
        dfs = new DepthFirstSearch(adjacency, basicVar, colLen);
        return dfs.search(basicVar);
    }

    /**
     * 邻接矩阵元素 = x*列数+y
     * 获取该负检验数的索引(检验数最小的)
     */
    private int getEnteringVar() {
        //获取该负检验数的索引
        int[] index = indexOfEnteringVar();
        int x = index[0];
        int y = index[1];
        return x * colLen + y;

    }

    private int[][] adjacencyMatrix() {
        int len = rowLen * colLen;
        int[][] adjacency = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j) continue;
                if (isBasicVar(i) && isBasicVar(j) && isNeighbour(i, j)) adjacency[i][j] = 1;
            }
//            System.out.println(Arrays.toString(adjacency[i]));
        }
        return adjacency;

    }


    /**
     * 检验数矩阵=0则为基变量，<0中最小的那个则为进基变量
     *
     * @param node 邻接矩阵的点0-11
     * @return 为（进）基变量？
     */
    private boolean isBasicVar(int node) {
        //若检验书<0,但该检验书不是最小检验书，则不选择
        int[][] reducedCost = new int[rowLen][colLen];
        for (int i = 0; i < rowLen; i++) {
            reducedCost[i] = Arrays.copyOf(this.reducedCost[i], colLen);
            for (int j = 0; j < colLen; j++) {
                if (reducedCost[i][j] < 0 && reducedCost[i][j] != UtilMeth.min(reducedCost))
                    reducedCost[i][j] = Integer.MAX_VALUE;
            }
        }
        return reducedCost[node / colLen][node % colLen] <= 0;
    }

    /**
     * @return 找到进基变量
     */
    private int[] indexOfEnteringVar() {
        return UtilMeth.index(reducedCost, UtilMeth.min(reducedCost));
    }

    /**
     * @param node1 点1
     * @param node2 点2
     * @return 点1 和 点2 是否为相邻
     */
    private boolean isNeighbour(int node1, int node2) {
        int x1 = node1 / colLen;
        int y1 = node1 % colLen;
        int x2 = node2 / colLen;
        int y2 = node2 % colLen;
        return x1 == x2 || y1 == y2;
    }
}
