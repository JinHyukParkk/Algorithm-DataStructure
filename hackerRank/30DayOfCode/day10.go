package main

import (
	"fmt"
)

func day10() {
	var n int
	fmt.Scan(&n)
	s := dec2bin(n)
	count := 0
	max := 0
	for _, r := range s {
		if string(r) == "1" {
			count++
		} else {
			count = 0
		}
		if count > max {
			max = count
		}
	}
	fmt.Println(max)
}

func dec2bin(dec int) string {
	bin := ""
	if dec >= 1 {
		bin = fmt.Sprintf("%d", dec%2) + bin
		bin = dec2bin(dec/2) + bin
	}
	return bin
}
func main() {
	//Enter your code here. Read input from STDIN. Print output to STDOUT
	day10()
}
