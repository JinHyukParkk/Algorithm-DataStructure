package com.example.algotest.algo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FailureRate {

    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Integer> stageFailureCountMap = new HashMap<>();
        HashMap<Integer, Double> stageFailureMap = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            stageFailureCountMap.put(i, 0);
            stageFailureMap.put(i, 0.0);
        }

        for (int stage : stages) {
            if (stage == N + 1) {
                stageFailureCountMap.put(N, stageFailureCountMap.getOrDefault(N, 0) + 0);
                continue;
            }

            stageFailureCountMap.put(stage, stageFailureCountMap.getOrDefault(stage, 0) + 1);
        }

        int total = stages.length;
        for (int key : stageFailureCountMap.keySet()) {
            if (total == 0) {
                stageFailureMap.put(key, 0.0);
                continue;
            }

            stageFailureMap.put(key, (double) stageFailureCountMap.get(key) / total);
            total -= stageFailureCountMap.get(key);
        }

        return stageFailureMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .mapToInt(x -> x)
                .toArray();
    }
}
