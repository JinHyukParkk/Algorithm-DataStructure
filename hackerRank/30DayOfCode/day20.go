package main

import (
	"fmt"
)

func day20() {
	var n int
	fmt.Scan(&n)
	arr := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&arr[i])
	}
	count := 0
	for i := 0; i < n-1; i++ {
		for j := i; j < n; j++ {
			if arr[i] > arr[j] {
				arr[i], arr[j] = arr[j], arr[i]
				count++
			}
		}
	}
	fmt.Println("Array is sorted in", count, "swaps.")
	fmt.Println("First Element:", arr[0])
	fmt.Println("Last Element:", arr[n-1])
}
func main() {
	day20()
}
