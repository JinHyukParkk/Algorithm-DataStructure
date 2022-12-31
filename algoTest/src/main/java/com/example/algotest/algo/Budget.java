package com.example.algotest.algo;

import java.util.Arrays;
import java.util.Scanner;

public class Budget {

    private static int[] provinces;
    private static long answer = 0;

    public void solusion() {
        Scanner sc = new Scanner(System.in);
        int provinceCount = sc.nextInt();
        provinces = new int[provinceCount];
        for (int i = 0; i < provinceCount; i++) {
            provinces[i] = sc.nextInt();
        }
        Arrays.sort(provinces);
        long budget = sc.nextLong();

        long left = 0;
        long right = provinces[provinceCount - 1];
        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;

            for (int money : provinces) {
                if (money >= mid) {
                    sum += mid;
                } else {
                    sum += money;
                }
            }

            if (sum > budget) {
                right = mid - 1;
            } else {
                left = mid + 1;
                answer = Math.max(answer, mid);
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) {
        new Budget().solusion();
    }
}
