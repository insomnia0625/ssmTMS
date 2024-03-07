package com.cqupt.common.TransportAlgorithm;

import java.util.LinkedHashMap;
import java.util.Map;

public class DepthFirstSearch {

    int[][] adjacency;
    int size;
    int basicVar;
    int colLen;
    boolean[] isVisited;
    int counter = 0;
    Map<Integer, Integer> cycle;

    public DepthFirstSearch(int[][] adjacency, int basicVar, int colLen) {
        this.adjacency = adjacency;
        this.size = adjacency.length;
        this.basicVar = basicVar;
        this.colLen = colLen;
        isVisited = new boolean[adjacency.length];
        this.cycle = new LinkedHashMap<>();
    }

    private int getFirstNeighbor(int i) {
        for (int j = 0; j < size; j++)
            if (adjacency[i][j] > 0) return j;
        return -1;

    }

    private int getNextNeighbor(int v1, int v2) {
        for (int j = v2 + 1; j < size; j++)
            if (adjacency[v1][j] > 0) return j;
        return -1;
    }

    private void depthFirstSearch(int i) {
        //形成闭合回路，则深度优先搜索终止
        if (isCycle(i, basicVar) && counter > 3) return;
//        System.out.printf("%s\t", i);
        cycle.put(i, counter + 1);
        isVisited[i] = true;
        counter += 1;
        int j = getFirstNeighbor(i);
        while (j != -1) {
            if (!isVisited[j]) depthFirstSearch(j);
            j = getNextNeighbor(i, j);
        }
    }

    Map<Integer, Integer> search(int i) {
//        System.out.println("\nDepth Fisrt Searching...");
        System.out.println("Found the closed loop: ");
        if (!isVisited[i]) depthFirstSearch(i);
        return cycle;
    }

    /**
     * @param node     current searching node
     * @param basicVar start node/basic variable needed to enter
     * @return is node adajacent to the basic variable ? true : false
     */
    private boolean isCycle(int node, int basicVar) {
        return node / colLen == basicVar / colLen || node % colLen == node % colLen;
    }

}
