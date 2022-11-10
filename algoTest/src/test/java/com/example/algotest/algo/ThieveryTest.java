package com.example.algotest.algo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ThieveryTest {

    Thievery thievery = new Thievery();

    @Test
    void case1() {
        int[] money = { 1, 2, 3, 1 };

        int answer = 4;


        assertThat(thievery.solution(money)).isEqualTo(answer);
    }

    @Test
    void case2() {
        int[] money = { 1, 2, 3, 4, 1, 1, 7};

        int answer = 13;

        assertThat(thievery.solution(money)).isEqualTo(answer);
    }

    @Test
    void case3() {
        int[] money = { 1, 1, 1, 1, 2, 3, 7};

        int answer = 10;

        assertThat(thievery.solution(money)).isEqualTo(answer);
    }
}