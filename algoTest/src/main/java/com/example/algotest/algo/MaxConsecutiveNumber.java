package com.example.algotest.algo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaxConsecutiveNumber {

    public int solution(int[] elements) {
        Set<Integer> sumElements = new HashSet<>();
        int[] tempElements = new int[elements.length * 2];

        for (int i = 0; i < elements.length; i++) {
            tempElements[i] = tempElements[i + elements.length] = elements[i];
        }

        for (int i = 1; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                sumElements.add(Arrays.stream(tempElements, j, j + i).sum());
            }
        }

        return sumElements.size();
    }
}
