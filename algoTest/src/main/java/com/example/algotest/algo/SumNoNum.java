package com.example.algotest.algo;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumNoNum {

    public int solution(int[] numbers) {
        return IntStream.range(0, 10)
                .filter(x ->
                        !IntStream.of(numbers)
                                .anyMatch(y -> x == y))
                .sum();
    }

    public int solution1(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }

    public int solution2(int[] numbers) {
        return IntStream.range(0, 10)
                .filter(i -> Arrays.stream(numbers)
                        .noneMatch(num -> i == num))
                .sum();
    }
}
