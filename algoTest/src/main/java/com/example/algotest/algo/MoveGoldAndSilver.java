package com.example.algotest.algo;

public class MoveGoldAndSilver {

    public long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        // 정답을 최대값으로 설정
        long answer = (long) (10e9 * 2 * 10e5 * 2);

        // 도시 길이
        int cityLength = g.length;

        // 이분 탐색을 위한 처음과 끝 값
        long start = 0;
        long end = (long) (10e9 * 2 * 10e5 * 2);    // x 2 를 해주는 이유는 처음 mid 값을 최대값으로 사용하기 위해

        // 이분 탐색 조건
        while (start <= end) {
            long mid = (start + end) / 2;
            int gold = 0;
            int silver = 0;
            int add = 0;

            for (int i = 0; i < cityLength; i++) {
                int nowGold = g[i];
                int nowSilver = s[i];
                int nowWeight = w[i];
                long nowTime = t[i];

                    long moveCount = mid / (nowTime * 2);
                    if (mid % (nowTime * 2) >= t[i]) {
                        moveCount++;
                    }

                gold += Math.min(nowGold, moveCount * nowWeight);
                silver += Math.min(nowSilver, moveCount * nowWeight);
                add += Math.min(nowGold + nowSilver, moveCount * nowWeight);
            }

            if (a <= gold && b <= silver && a + b <= add) {
                end = mid - 1;
                answer = Math.min(mid, answer);
                continue;
            }

            start = mid + 1;
        }

        return answer;
    }
}
