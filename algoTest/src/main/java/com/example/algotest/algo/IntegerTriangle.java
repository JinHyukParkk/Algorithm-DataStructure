package com.example.algotest.algo;

import java.util.Arrays;

public class IntegerTriangle {
    public int solution(int[][] triangle) {
        int[][] dp = new int[triangle.length + 1][triangle.length + 1];

        dp[0][0] = triangle[0][0];
        for (int i = 1; i < triangle.length; i++) {
            dp[i][0] = triangle[i][0] + dp[i-1][0];
            dp[i][i] = triangle[i][i] + dp[i-1][i-1];
            for (int j = 1; j < i; j++) {
                dp[i][j] = triangle[i][j] + Math.max(dp[i-1][j-1], dp[i-1][j]);
            }
        }

        return Arrays.stream(dp[triangle.length - 1]).max().getAsInt();
    }
}
