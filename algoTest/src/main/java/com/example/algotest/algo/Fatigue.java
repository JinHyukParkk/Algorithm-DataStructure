package com.example.algotest.algo;

public class Fatigue {

    int result;
    int[][] globalDungeons;
    boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        globalDungeons = dungeons;
        visited = new boolean[dungeons.length];

        recursive(k, 0);

        return result;
    }

    private void recursive(int currentK, int count) {
        for (int i = 0; i < globalDungeons.length; i++) {
            if (!visited[i] && currentK >= globalDungeons[i][0]) {
                visited[i] = true;
                recursive(currentK - globalDungeons[i][1], count + 1);
                visited[i] = false;
            }
        }
        result = Math.max(result, count);
    }
}
