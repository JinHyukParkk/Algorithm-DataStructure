package main

import (
	"fmt"
)

func Day3() {
	var num int
	fmt.Scan(&num)
	if num%2 == 1 {
		fmt.Println("Weird")
	} else if num < 5 {
		fmt.Println("Not Weird")
	} else if num <= 20 {
		fmt.Println("Weird")
	} else {
		fmt.Println("Not Weird")
	}
}
