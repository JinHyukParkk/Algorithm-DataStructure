package graph

import (
	"fmt"
)


func contains(a []int, x int) bool {
	for _, n := range a {
		if x == n {
			return true
		}
	}
	return false
}

func search(start int, graph map[int][]int) bool {

	var queue = []int{}

	queue = append(queue, graph[start]...)
	var serarched = []int{}

	for len(queue) > 0 {
		arrayN := queue[len(queue)-1 : len(queue)]
		queue = queue[:len(queue)-1]
	
		if !contains(serarched, arrayN[0]) {
			if findVal(arrayN[0]) {
				return true
			} else {
				queue = append(queue, graph[arrayN[0]]...)
				serarched = append(serarched, arrayN[0])
			}
		}

	}
	return false
}
func findVal(val int) bool {
	return val == 5;

}
func main() {

	graph := make(map[int][]int)
	graph[1] = []int{2, 3, 4}
	graph[2] = []int{9}
	graph[3] = []int{5, 6}
	graph[4] = []int{7, 8, 9}
	graph[5] = []int{}
	graph[6] = []int{}
	graph[7] = []int{}
	graph[8] = []int{}
	graph[9] = []int{}

	fmt.Println(search(1, graph))
}