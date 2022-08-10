package com.example.algotest.algo;

public class TargetNumber {

    int answer;
    int targetNum;

    public int solution(int[] numbers, int target) {
        answer = 0;
        targetNum = target;

        dfs(numbers, 0, 0);

        return answer;
    }

    private void dfs(int[] numbers, int depth, int sum) {
        if (numbers.length == depth) {
            if (sum == targetNum)
                answer++;
        } else {
            dfs(numbers, depth + 1, sum + numbers[depth]);
            dfs(numbers, depth + 1, sum - numbers[depth]);
        }
    }
}

