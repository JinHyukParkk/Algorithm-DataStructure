package com.example.algotest.algo;

import java.util.Arrays;

public class Thievery {

    /**
     * 첫 번째를 선택하는 경우
     * 첫 번째를 선택하지 않는 경우
     *
     * @param money
     * @return
     */
    public int solution(int[] money) {
        int answer = 0;

        if (money.length == 3) {
            return Arrays.stream(money).min().getAsInt();
        }

        int[] dpWithFirst = new int[money.length];
        int[] dpWithoutFirst = new int[money.length];

        dpWithFirst[0] = dpWithFirst[1] = money[0];

        dpWithoutFirst[0] = 0;
        dpWithoutFirst[1] = money[1];

        for (int i = 2; i < money.length; i++) {
            dpWithoutFirst[i] = Math.max(dpWithoutFirst[i - 1], dpWithoutFirst[i - 2] + money[i]);
            answer = Math.max(dpWithoutFirst[i], answer);

            if (i == money.length - 1) {
                break;
            }
            dpWithFirst[i] = Math.max(dpWithFirst[i - 1], dpWithFirst[i - 2] + money[i]);
            answer = Math.max(dpWithFirst[i], answer);

        }

        return answer;
    }
}
