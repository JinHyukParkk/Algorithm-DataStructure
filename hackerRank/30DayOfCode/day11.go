package main

import (
	"bufio"
	"fmt"
	"math"
	"os"
	"strconv"
)

var cin = bufio.NewScanner(os.Stdin)

func readInt() int {
	cin.Scan()
	r, _ := strconv.Atoi(string(cin.Bytes()))
	return r
}

func day11() {
	var arr [6][6]int
	cin.Split(bufio.ScanWords)
	for i := 0; i < 6; i++ {
		for j := 0; j < 6; j++ {
			arr[i][j] = readInt()
		}
	}

	max := math.MinInt8
	for i := 0; i < 4; i++ {
		for j := 0; j < 4; j++ {
			sum := 0
			sum += arr[i][j]
			sum += arr[i][j+1]
			sum += arr[i][j+2]
			sum += arr[i+1][j+1]
			sum += arr[i+2][j]
			sum += arr[i+2][j+1]
			sum += arr[i+2][j+2]
			if max < sum {
				max = sum
			}
		}
	}
	fmt.Println(max)
}
