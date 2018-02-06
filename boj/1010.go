package main

import (
	"fmt"
)

var (
	tc, n, m int
	dp       [][]int
)

func main() {
	dp = make([][]int, m+1)
	for i := 0; i <= m; i++ {
		dp[i] = make([]int, n+1)
	}

	fmt.Scanln(&tc)
	for i := 0; i < tc; i++ {
		fmt.Scan(&n, &m)
		fmt.Println(sol(n, m))
	}
}
func sol(n int, m int) int {
	dp := make([][]int, n+1)
	for i := 0; i < m+1; i++ {
		dp[i] = make([]int, m+1)
	}

	for i := 1; i < n+1; i++ {
		for j := i; j < m+1; j++ {
			if i == j || j == 1 {
				dp[i][j] = 1
			} else {
				dp[i][j] = dp[i][j-1] + dp[i-1][j-1]
			}
		}
	}
	return dp[n][m]
}
