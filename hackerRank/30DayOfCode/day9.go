package main

import (
	"fmt"
)

func day9(n int) int {
	if n == 1 {
		return n
	} else {
		return n * day9(n-1)
	}

}
func main() {
	var n int
	fmt.Scan(&n)
	fmt.Println(day9(n))
}
