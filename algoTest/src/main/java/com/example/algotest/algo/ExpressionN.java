package com.example.algotest.algo;

public class ExpressionN {

    int ans = -1;

    public int solution(int n, int number) {
        recursion(n, number, 0, 0);
        return ans;
    }

    public void recursion(int n, int number, int c, int a) {
        if (c > 8) {
            ans = -1;
            return;
        }

        if (a == number) {
            ans = (ans == -1 || ans > c) ? c : ans;
            return;
        }

        int ns = n;
        for (int i = 1; i < 9 - c; i++) {
            int afterC = c + i;
            recursion(n, number, afterC, a + ns);
            recursion(n, number, afterC, a - ns);
            recursion(n, number, afterC, a * ns);
            recursion(n, number, afterC, a / ns);
            ns = ns * 10 + n;
        }
    }
}
