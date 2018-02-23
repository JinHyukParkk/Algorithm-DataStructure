package main

import (
	"fmt"
	"math"
)

func day25() {
	var n int
	fmt.Scan(&n)
	for i := 0; i < n; i++ {
		var t int
		fmt.Scan(&t)
		fmt.Println(IsPrime(t))
	}
}
func IsPrime(n int) string {
	if n < 2 {
		return "Not prime"
	} else if n == 2 {
		return "Prime"
	} else if n%2 == 0 {
		return "Not prime"
	}
	b := math.Sqrt(float64(n))

	for i := 3; i <= int(b); i++ {
		if n%i == 0 {
			return "Not prime"
		}
	}
	return "Prime"
}
func main() {
	day25()
}
