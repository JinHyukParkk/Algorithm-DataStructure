package com.example.algotest.algo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SumYinAndYangTest {

    SumYinAndYang sumYinAndYang = new SumYinAndYang();

    @Test
    void case1() {
        int[] absolutes = new int[]{4,7,12};
        boolean[] signs = new boolean[]{true, false, true};

        assertThat(sumYinAndYang.solution(absolutes, signs)).isEqualTo(9);
    }

}
