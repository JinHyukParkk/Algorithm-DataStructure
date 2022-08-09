package com.example.algotest.algo;

public class NumOfCountry124 {

    // 124 나라에는 자연수만 존재합니다.
    // 124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int[] mappingNum = new int[]{4, 1, 2};

        while (n > 0) {
            sb.append(mappingNum[n % 3]);
            n = (n -1) / 3;
        }

        return sb.reverse().toString();
    }
}
