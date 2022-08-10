package com.example.algotest.algo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BigNumberTest {

    BigNumber bigNumber = new BigNumber();

    @Test
    void case1() {
        int[] numbers = new int[]{6, 10, 2};

        String result = bigNumber.solution(numbers);

        assertThat(result).isEqualTo("6210");
    }

    @Test
    void case2() {
        int[] numbers = new int[]{3, 30, 34, 5, 9};

        String result = bigNumber.solution(numbers);

        assertThat(result).isEqualTo("9534330");
    }

    @Test
    void case3() {
        int[] numbers = new int[]{0, 10, 1};

        String result = bigNumber.solution(numbers);

        assertThat(result).isEqualTo("1100");
    }

    @Test
    void case4() {
        int[] numbers = new int[]{0};

        String result = bigNumber.solution(numbers);

        assertThat(result).isEqualTo("0");
    }
}
