package main

import (
	"fmt"
)

func day7() {
	var ts int
	fmt.Scan(&ts)
	slice := make([]int, ts)
	for i := 0; i < ts; i++ {
		fmt.Scan(&slice[i])
	}
	for i := ts - 1; 0 <= i; i-- {
		fmt.Printf("%d ", slice[i])
	}
}
