package com.example.algotest.algo;

import java.util.Arrays;

public class MinRectangle {

    public int solution(int[][] sizes) {
        int x = 0;
        int y = 0;

        for (int[] size : sizes) {
            x = Math.max(x, Math.max(size[0], size[1]));
            y = Math.max(y, Math.min(size[0], size[1]));
        }

        return x * y;
    }

    public int solution1(int[][] sizes) {
        return Arrays.stream(sizes)
                .reduce((a, b) -> new int[]{
                        Math.max(Math.max(a[0], a[1]), Math.max(b[0], b[1])),
                        Math.max(Math.min(a[0], a[1]), Math.min(b[0], b[1]))
                }).map(it -> it[0] * it[1]).get();
    }
}
