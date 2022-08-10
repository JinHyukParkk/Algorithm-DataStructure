package com.example.algotest.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class FeatureDevelopment {

    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        IntStream.range(0, progresses.length)
                .forEach(i ->
                        queue.add((int) Math.ceil((100 - progresses[i]) / speeds[i])));

        while (!queue.isEmpty()) {
            int day = queue.poll();
            int count = 1;

            while (!queue.isEmpty() && day >= queue.peek()) {
                count++;
                queue.poll();
            }
            answer.add(count);
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public int[] solution1(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        var ref = new Object() {
            int day = -1;
        };

        IntStream.range(0, progresses.length)
                .forEach(i -> {
                    while (progresses[i] + (ref.day * speeds[i]) < 100) {
                        ref.day++;
                    }
                    dayOfend[ref.day]++;
                });

        return Arrays.stream(dayOfend).filter(i -> i != 0).toArray();
    }
}
