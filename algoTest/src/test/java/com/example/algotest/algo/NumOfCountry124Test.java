package com.example.algotest.algo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumOfCountry124Test {

    NumOfCountry124 numOfCountry124 = new NumOfCountry124();

    @Test
    void case1() {
        int n = 10;

        assertThat(numOfCountry124.solution(n)).isEqualTo("41");
    }
}
