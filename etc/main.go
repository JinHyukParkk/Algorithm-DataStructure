package main

import (
	// "Algorithm_DataStructure/etc/algo"
	"Algorithm_DataStructure/etc/oop"
	"fmt"
)

func main() {
	// algo.Multiplication()

	person := oop.NewPerson("hyuk")
	fmt.Println(person.GetName())
	person.SetName("hyuk2")
	fmt.Println(person.GetName())
	person.Check()

	man := oop.NewMan("hyuk")
	fmt.Println(man.GetName())
	man.SetName("hyuk2")
	fmt.Println(man.GetName())
	man.Check()
}
