package com.example.algotest.algo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CoinChangeTest {

    CoinChange coinChange = new CoinChange();

    @Test
    void case1() {
        int[] coins = {1, 2, 5};
        int amount = 11;

        int answer = 3;

        assertThat(coinChange.coinChange(coins, amount)).isEqualTo(answer);
    }

    @Test
    void case2() {
        int[] coins = {2};
        int amount = 3;

        int answer = -1;

        assertThat(coinChange.coinChange(coins, amount)).isEqualTo(answer);
    }

    @Test
    void case3() {
        int[] coins = {1};
        int amount = 0;

        int answer = 0;

        assertThat(coinChange.coinChange(coins, amount)).isEqualTo(answer);
    }

    @Test
    void case4() {
        int[] coins = {1, 2147483647};
        int amount = 2;

        int answer = 2;

        assertThat(coinChange.coinChange(coins, amount)).isEqualTo(answer);
    }

    @Test
    void case5() {
        int[] coins = {186, 419, 83, 408};
        int amount = 6249;

        int answer = 20;

        assertThat(coinChange.coinChange(coins, amount)).isEqualTo(answer);
    }
}
