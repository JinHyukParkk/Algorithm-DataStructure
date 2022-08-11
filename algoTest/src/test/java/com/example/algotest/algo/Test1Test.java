package com.example.algotest.algo;

import com.example.algotest.exam.Test1;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Test1Test {

    Test1 test1 = new Test1();

    @Test
    void case1() {
        String s = "abccbd";
        int[] c = new int[]{0, 1, 2, 3, 4, 5};

        int result = test1.solution(s, c);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void case2() {
        String s = "aabbcc";
        int[] c = new int[]{1,2,1,2,1,2};

        int result = test1.solution(s, c);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void case3() {
        String s = "aaaa";
        int[] c = new int[]{3,4,5,6};

        int result = test1.solution(s, c);

        assertThat(result).isEqualTo(12);
    }

    @Test
    void case4() {
        String s = "ababa";
        int[] c = new int[]{10,5,10,5,10};

        int result = test1.solution(s, c);

        assertThat(result).isEqualTo(0);
    }

    @Test
    void case5() {
        String s = "abaaba";
        int[] c = new int[]{10,5,10,10,5,10};

        int result = test1.solution(s, c);

        assertThat(result).isEqualTo(10);
    }

    @Test
    void case6() {
        String s = "abaaba";
        int[] c = new int[]{10,5,10,10,5,10};

        int result = test1.solution(s, c);

        assertThat(result).isEqualTo(10);
    }

    @Test
    void case7() {
        String s = "aaabaa";
        int[] c = new int[]{2,2,1,1,3,3};

        int result = test1.solution(s, c);

        assertThat(result).isEqualTo(6);
    }

}
