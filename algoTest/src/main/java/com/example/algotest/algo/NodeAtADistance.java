package com.example.algotest.algo;

import java.util.LinkedList;
import java.util.Queue;

public class NodeAtADistance {

    public int solution(int n, int[][] edge) {
        int d[] = new int[n + 1];
        boolean map[][] = new boolean[n + 1][n + 1];

        for (int i = 0; i < edge.length; i++) {
            map[edge[i][0]][edge[i][1]] = true;
            map[edge[i][1]][edge[i][0]] = true;
        }

        Queue<Integer> q = new LinkedList<>();
        int max = 0;
        int count = 0;

        q.add(1);
        while (!q.isEmpty()) {
            int i = q.poll();

            for (int j = 2; j <= n; j++) {
                // 안들렸고, 연결된
                if (d[j] == 0 && map[i][j]) {
                    d[j] = d[i] + 1;
                    q.add(j);
                    max = Math.max(max, d[j]);
                }
            }
        }

        for (int i : d) {
            if (i == max) {
                count++;
            }
        }

        return count;
    }
}
