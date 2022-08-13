package com.example.algotest.algo;

import java.util.Arrays;

public class Lifeboat {

    public int solution(int[] people, int limit) {
        int answer = 0;
        int min = 0;

        Arrays.sort(people);

        for (int max = people.length - 1; min <= max; max--){
            if (people[min] + people[max] <= limit) {
                min++;
            }
            answer++;
        }

        return answer;
    }
}
