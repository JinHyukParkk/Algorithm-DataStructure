package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	var col, raw int
	var mapText string
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	fmt.Sscan(scanner.Text(), &col, &raw)
	arr := make([][]int, col)
	for i := 0; i < col; i++ {
		arr[i] = make([]int, raw)
		scanner.Scan()
		fmt.Sscan(scanner.Text(), &mapText)
		for j := 0; j < len(mapText); j++ {
			arr[i][j] = int(mapText[i] - '0')
		}
	}
	visit := make([][]bool, col, raw)
	pos := make([][]int, col, raw)

}
