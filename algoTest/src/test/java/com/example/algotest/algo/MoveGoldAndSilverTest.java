package com.example.algotest.algo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MoveGoldAndSilverTest {

    MoveGoldAndSilver moveGoldAndSilver = new MoveGoldAndSilver();

    @Test
    void case1() {
        int a = 10;
        int b = 10;
        int[] g = {100};
        int[] s = {100};
        int[] w = {7};
        int[] t = {10};
        int result = 50;

        assertThat(moveGoldAndSilver.solution(a, b, g, s, w, t)).isEqualTo(result);
    }
}
