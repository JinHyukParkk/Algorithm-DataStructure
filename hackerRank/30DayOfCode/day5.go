package main

import "fmt"

func Day5() {
	var num int
	fmt.Scan(&num)
	for i := 1; i <= 10; i++ {
		fmt.Println(num, "x", i, "=", num*i)
	}
}
