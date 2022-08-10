package com.example.algotest.algo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TargetNumberTest {

    TargetNumber targetNumber = new TargetNumber();

    int[] numbers;
    int target;
    int answer;

    @Test
    void case1() {
        // given
        numbers = new int[]{1, 1, 1, 1, 1};
        target = 3;
        answer = 5;

        // when
        int result = targetNumber.solution(numbers, target);

        // then
        assertThat(result).isEqualTo(answer);
    }

    @Test
    void case2() {
        // given
        numbers = new int[]{4, 1, 2, 1};
        target = 4;
        answer = 2;

        // when
        int result =targetNumber.solution(numbers, target);

        // then
        assertThat(result).isEqualTo(answer);
    }
}
