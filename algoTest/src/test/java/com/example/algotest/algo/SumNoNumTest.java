package com.example.algotest.algo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumNoNumTest {

    SumNoNum sumNoNum = new SumNoNum();

    @Test
    void case1() {
        int[] numbers = new int[]{1,2,3,4,6,7,8,0};

        int answer = sumNoNum.solution2(numbers);
        assertThat(answer).isEqualTo(14);
    }

    @Test
    void case2() {
        int[] numbers = new int[]{5,8,4,0,6,7,9};

        int answer = sumNoNum.solution(numbers);
        assertThat(answer).isEqualTo(6);
    }
}
