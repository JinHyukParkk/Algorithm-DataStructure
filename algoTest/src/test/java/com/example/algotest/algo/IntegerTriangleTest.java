package com.example.algotest.algo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntegerTriangleTest {

    IntegerTriangle integerTriangle = new IntegerTriangle();

    @Test
    void case1() {
        int[][] triangle = new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        int answer = 30;

        int result = integerTriangle.solution(triangle);

        assertThat(result).isEqualTo(answer);
    }
}
