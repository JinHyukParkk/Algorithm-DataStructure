package com.example.algotest.algo;

import com.example.algotest.exam.Test4;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Test4Test {

    Test4 test4 = new Test4();

    @Test
    void case1() {
        int n = 2;
        String s = "1A 2F 1C";

        int result = test4.solution(n, s);

        assertThat(result).isEqualTo(2);
    }
    @Test
    void case2() {
        int n = 1;
        String s = "";

        int result = test4.solution(n, s);

        assertThat(result).isEqualTo(2);
    }

}
