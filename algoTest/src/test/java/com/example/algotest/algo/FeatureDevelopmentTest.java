package com.example.algotest.algo;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class FeatureDevelopmentTest {

    FeatureDevelopment featureDevelopment = new FeatureDevelopment();

    @Test
    void case1() {
        int[] progresses = new int[]{93, 30, 55};
        int[] speeds = new int[]{1, 30, 5};

        int[] answer = new int[]{2,1};
        int[] result = featureDevelopment.solution(progresses, speeds);

        for (int i : result) {
            System.out.println(i);

        }

        IntStream.range(0, answer.length)
                .forEach(i ->
                        assertThat(answer[i]).isEqualTo(result[i]));

    }

    @Test
    void case2() {
        int[] progresses = new int[]{95, 90, 99, 99, 80, 99};
        int[] speeds = new int[]{1, 1, 1, 1, 1, 1};

        int[] answer = new int[]{1, 3, 2};
        int[] result = featureDevelopment.solution1(progresses, speeds);

        IntStream.range(0, result.length)
                .forEach(i ->
                        assertThat(result[i]).isEqualTo(answer[i]));
    }

}
