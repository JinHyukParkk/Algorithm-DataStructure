package com.example.algotest.algo;

import java.util.Arrays;

public class IntegerTriangle {

    public int solution(int[][] triangle) {

        int[][] dp = new int[triangle.length + 1][triangle.length + 1];

        dp[0][0] = triangle[0][0];
        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0) {
                    dp[i][j] = triangle[i][j] + dp[i - 1][j];
                } else if (j == triangle[i].length) {
                    dp[i][j] = triangle[i][j] + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = triangle[i][j] + Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
                }
            }
        }

        return Arrays.stream(dp[triangle.length - 1])
                .max()
                .getAsInt();
    }
}
