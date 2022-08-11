package com.example.algotest.algo;

import com.example.algotest.exam.Test2;
import org.junit.jupiter.api.Test;

class Test2Test {

    Test2 test2 = new Test2();

    @Test
    void case1() {
        int a = 6;
        int b = 1;
        int c = 1;

        System.out.println(test2.solution(a, b, c));
    }

    @Test
    void case2() {
        int a = 1;
        int b = 3;
        int c = 1;

        System.out.println(test2.solution(a, b, c));
    }

    @Test
    void case3() {
        int a = 0;
        int b = 1;
        int c = 8;

        System.out.println(test2.solution(a, b, c));
    }

    @Test
    void case4() {
        int a = 0;
        int b = 0;
        int c = 1;

        System.out.println(test2.solution(a, b, c));
    }

    @Test
    void case5() {
        int a = 33;
        int b = 33;
        int c = 33;

        System.out.println(test2.solution(a, b, c));
    }
}
