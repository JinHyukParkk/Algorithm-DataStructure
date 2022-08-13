package com.example.algotest.algo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LifeboatTest {

    Lifeboat lifeboat = new Lifeboat();

    @Test
    void case1() {
        int[] people = new int[]{70, 50, 80, 50};
        int limit = 100;

        int result = lifeboat.solution(people, limit);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void case2() {
        int[] people = new int[]{70, 80, 50};
        int limit = 100;

        int result = lifeboat.solution(people, limit);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void case3() {
        int[] people = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90};
        int limit = 100;

        int result = lifeboat.solution(people, limit);

        assertThat(result).isEqualTo(5);
    }
}
