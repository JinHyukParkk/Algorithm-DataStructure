package com.example.algotest.algo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MaxConsecutiveNumberTest {

    MaxConsecutiveNumber maxConsecutiveNumber = new MaxConsecutiveNumber();

    @Test
    void case1() {
        int[] elements = {7, 9, 1, 1, 4};
        int result = 18;

        assertThat(maxConsecutiveNumber.solution(elements)).isEqualTo(result);
    }
}
