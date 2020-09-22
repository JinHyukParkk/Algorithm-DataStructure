package main

import (
	"Algorithm_DataStructure/DataStructure/tree"
	"fmt"
)

func main() {
	t := tree.New()
	t.Insert(5)
	t.Insert(6)
	t.Insert(2)
	t.Insert(11)
	t.Insert(5)
	t.Insert(2)
	t.Insert(8)
	tree.PrintNode(t.Node)
	fmt.Println(t.Node.ExistsNode(4))
	fmt.Println(t.Node.ExistsNode(3))

}
