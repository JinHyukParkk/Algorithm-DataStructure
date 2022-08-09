package com.example.algotest.algo;

import java.util.stream.IntStream;

public class SumNoNum {

    public int solution(int[] numbers) {
        int answer = IntStream.range(1, 10)
                .filter(x ->
                        !IntStream.of(numbers)
                                .anyMatch(y -> x == y))
                .sum();

        return answer;
    }
}
