package main

import (
	"github.com/JinHyukParkk/goAlgorithm/DataStructure/list"
)

func main() {
	// list.ArrayTest()
	l := list.New()
	l.Insert(1)
	l.Insert(5)
	l.Insert(8)
	l.Insert(3)
	l.Display()
	l.Delete(8)
	l.Display()

}
