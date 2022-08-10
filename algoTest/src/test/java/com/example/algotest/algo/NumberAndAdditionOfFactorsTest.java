package com.example.algotest.algo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberAndAdditionOfFactorsTest {

    NumberAndAdditionOfFactors numberAndAdditionOfFactors = new NumberAndAdditionOfFactors();

    @Test
    void case1() {
        int left = 13;
        int right = 17;
        int answer = 43;

        int result = numberAndAdditionOfFactors.solution(left, right);

        assertThat(result).isEqualTo(answer);
    }

    @Test
    void case2() {
        int left = 24;
        int right = 27;
        int answer = 52;

        int result = numberAndAdditionOfFactors.solution(left, right);

        assertThat(result).isEqualTo(answer);
    }
}
