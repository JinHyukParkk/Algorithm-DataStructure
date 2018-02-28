package main

import (
	"fmt"
)

func day29() {
	var tc int
	fmt.Scan(&tc)
	for i := 0; i < tc; i++ {
		var x, y int
		fmt.Scan(&x, &y)
		max := 0
		for j := 1; j < x; j++ {
			for k := j + 1; k <= x; k++ {
				co := j & k
				if max < co && co < y {
					max = co
				}
			}
		}
		fmt.Println(max)
	}
}
func main() {
	day29()
}
