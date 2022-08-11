package com.example.algotest.algo;

import com.example.algotest.exam.Test3;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Test3Test {

    Test3 test3 = new Test3();

    @Test
    void case1() {
        int n = 5;
        int[] a = new int[]{2, 2, 1, 2};
        int[] b = new int[]{1, 3, 4, 4};

        int result = test3.solution(n, a, b);

        assertThat(result).isEqualTo(31);
    }

    @Test
    void case2() {
        int n = 3;
        int[] a = new int[]{1};
        int[] b = new int[]{3};

        int result = test3.solution(n, a, b);

        assertThat(result).isEqualTo(5);
    }

    @Test
    void case3() {
        int n = 4;
        int[] a = new int[]{1, 3};
        int[] b = new int[]{2, 4};

        int result = test3.solution(n, a, b);

        assertThat(result).isEqualTo(10);
    }

}
