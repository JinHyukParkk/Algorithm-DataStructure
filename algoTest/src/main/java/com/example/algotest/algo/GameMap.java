package com.example.algotest.algo;

import java.util.LinkedList;
import java.util.Queue;

public class GameMap {

    int[] moveX = {1, 0, -1, 0};
    int[] moveY = {0, 1, 0, -1};
    int result = 0;

    public int solution(int[][] maps) {
        int[][] visited = new int[maps.length][maps[0].length];

        bfs(maps, visited);

        if (result == 0) {
            result = -1;
        }

        return result;
    }

    public void bfs(int[][] maps, int[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});

        visited[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] current = queue.remove();
            int currentX = current[0];
            int currentY = current[1];

            for (int i = 0; i < 4; i++) {
                int nextX = currentX + moveX[i];
                int nextY = currentY + moveY[i];

                if (nextX < 0 || nextX > maps.length - 1 || nextY < 0
                        || nextY > maps[0].length - 1) {
                    continue;
                }

                if (visited[nextX][nextY] == 0 && maps[nextX][nextY] == 1) {
                    visited[nextX][nextY] = visited[currentX][currentY] + 1;
                    queue.add(new int[][]{nextX, nextY});
                }
            }
        }
    }
}
