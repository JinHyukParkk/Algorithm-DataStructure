package main

import (
	"fmt"
	"strconv"
)

func day8() {
	x := make(map[string]int)
	var ts int
	fmt.Scan(&ts)
	for i := 0; i < ts; i++ {
		var s string
		var n int
		fmt.Scanln(&s, &n)
		x[s] = n
	}
	for i := 0; i < ts; i++ {
		var s string
		fmt.Scan(&s)
		if val, ok := x[s]; ok {
			fmt.Println(s + "=" + strconv.Itoa(val))
		} else {
			fmt.Println("Not found")
		}
	}
}
func main() {
	day8()
}
