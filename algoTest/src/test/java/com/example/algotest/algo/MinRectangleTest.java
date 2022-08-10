package com.example.algotest.algo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinRectangleTest {

    MinRectangle minRectangle = new MinRectangle();

    @Test
    void case1() {
        int[][] sizes = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        int result = minRectangle.solution(sizes);

        assertThat(result).isEqualTo(4000);
    }

    @Test
    void case2() {
        int[][] sizes = new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};

        int result = minRectangle.solution(sizes);

        assertThat(result).isEqualTo(120);
    }

    @Test
    void case3() {
        int[][] sizes = new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        int result = minRectangle.solution(sizes);

        assertThat(result).isEqualTo(133);
    }

}
