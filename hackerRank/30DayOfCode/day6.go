package main

import (
	"fmt"
)

func Day6() {
	var ts int

	fmt.Scan(&ts)
	for i := 0; i < ts; i++ {
		var s string
		var s1 string = ""
		var s2 string = ""
		fmt.Scan(&s)
		for i, r := range s {
			if i%2 == 0 {
				s1 += string(r)
			} else {
				s2 += string(r)
			}
		}
		fmt.Println(s1, s2)
	}
}
