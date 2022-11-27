package com.example.algotest.algo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FatigueTest {

    Fatigue fatigue = new Fatigue();

    @Test
    void case1() {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        int result = 3;

        assertThat(fatigue.solution(k, dungeons)).isEqualTo(result);
    }

    @Test
    void case2() {
        int k = 100;
        int[][] dungeons = {{20, 10}, {80, 10}, {40, 20}, {50, 20}, {60, 20}, {70, 10}, {80, 30}, {90, 30}};

        int result = 6;

        assertThat(fatigue.solution(k, dungeons)).isEqualTo(result);
    }
}
