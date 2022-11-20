package com.example.algotest.algo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FailureRateTest {

    FailureRate failureRate = new FailureRate();

    @Test
    void case1() {
        int n = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        int[] result = {3, 4, 2, 1, 5};

        int[] answer = failureRate.solution(n, stages);

        for (int i = 0; i < result.length; i++) {
            assertThat(result[i]).isEqualTo(answer[i]);
        }
    }

    @Test
    void case2() {
        int n = 4;
        int[] stages = {4, 4, 4, 4, 4};

        int[] result = {4, 1, 2, 3};

        int[] answer = failureRate.solution(n, stages);

        for (int i = 0; i < result.length; i++) {
            assertThat(result[i]).isEqualTo(answer[i]);
        }
    }
}
