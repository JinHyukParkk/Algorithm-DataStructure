package com.example.algotest.algo;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        int[] amounts = new int[amount + 1];
        int recur = recusive(coins, amounts, amount);

        return recur > amount ? -1 : recur;
    }

    private int recusive(int[] coins, int[] amounts, int amount) {

        if (amount < 0) {
            return Integer.MAX_VALUE - 1;
        }
        if (amount == 0) {
            return 0;
        }
        if (amounts[amount] > 0) {
            return amounts[amount];
        }
        int min = Integer.MAX_VALUE - 1;

        for (int i = 0; i < coins.length; i++) {
            min = Math.min(min, recusive(coins, amounts, amount - coins[i]) + 1);
        }

        return amounts[amount] = min;
    }
}
