package com.example.algotest.algo;

import java.util.stream.IntStream;

public class NumberAndAdditionOfFactors {

    public int solution(int left, int right) {
        return IntStream.rangeClosed(left, right)
                .reduce(0, (a, b) -> {
                    if (b % Math.sqrt(b) == 0) {
                        return a - b;
                    } else {
                        return a + b;
                    }
                });
    }
}
