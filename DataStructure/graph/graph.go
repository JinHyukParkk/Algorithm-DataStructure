package graph

import (
	"fmt"
	"strings"
)


func Contains(a []string, x string) bool {
	for _, n := range a {
		if x == n {
			return true
		}
	}
	return false
}

func search(start int, graph map[int][]int) bool {

	var search_queue = []string{}

	search_queue = append(search_queue, graph[start]...)
	var serarched = []string{}

	for len(search_queue) > 0 {
		person := search_queue[len(search_queue)-1 : len(search_queue)]
		search_queue = search_queue[:len(search_queue)-1]
		//pop
		fmt.Println(person[0] + " is a pop")
		if !Contains(serarched, person[0]) {
			fmt.Println("inner contains")
			if person_is_sellor(person[0]) {
				fmt.Println(person[0] + " is a mango seller!")
				return true
			} else {
				search_queue = append(search_queue, graph[person[0]]...)
				serarched = append(serarched, person[0])
			}
		}

	}
	return false
}
func person_is_sellor(name string) bool {

	return strings.EqualFold(name[len(name)-1:len(name)], "m")

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