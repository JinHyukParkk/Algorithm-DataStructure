package com.example.algotest.algo;

import java.util.ArrayList;
import java.util.List;

public class HallOfFame {

    public List<Integer> fames = new ArrayList<>();
    int globalK;

    public int[] solution(int k, int[] score) {
        List<Integer> answer = new ArrayList<>();
        globalK = k;

        // 명예의 전당에 넣기
        // 최솟값 뽑기
        for (int i : score) {
            answer.add(putFame(i).get(0));
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public List<Integer> putFame(int value) {
        if (fames.size() == globalK) {
            if (fames.get(0) > value) {
                return fames;
            }

            fames.remove(0);
        }

        fames.add(value);
        fames.sort(Integer::compare);

        return fames;
    }
}
