package com.example.algotest.algo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HallOfFameTest {

    HallOfFame hallOfFame;

    @BeforeEach
    void setUp() {
        hallOfFame = new HallOfFame();
    }

    @Test
    void case1() {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] answer = {10, 10, 10, 20, 20, 100, 100};

        int[] result = hallOfFame.solution(k, score);

        assertThat(result.length).isEqualTo(answer.length);

        for (int i = 0; i < answer.length; i++) {
            assertThat(result[i]).isEqualTo(answer[i]);
        }
    }

    @Test
    void case2() {
        int k = 4;
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] answer = {0, 0, 0, 0, 20, 40, 70, 70, 150, 300};

        int[] result = hallOfFame.solution(k, score);

        assertThat(result.length).isEqualTo(answer.length);

        for (int i = 0; i < answer.length; i++) {
            assertThat(result[i]).isEqualTo(answer[i]);
        }
    }

    @Test
    void putFame() {
        var fames = hallOfFame.putFame(10);

        assertThat(fames.get(0)).isEqualTo(10);

        hallOfFame.putFame(100);
        hallOfFame.putFame(20);
        var out = hallOfFame.putFame(150);

        assertThat(out.size()).isEqualTo(3);

        assertThat(out.get(0)).isEqualTo(20);
        assertThat(out.get(1)).isEqualTo(100);
        assertThat(out.get(2)).isEqualTo(150);

        out = hallOfFame.putFame(1);
        assertThat(out.get(0)).isEqualTo(20);
        assertThat(out.get(1)).isEqualTo(100);
        assertThat(out.get(2)).isEqualTo(150);
    }
}
