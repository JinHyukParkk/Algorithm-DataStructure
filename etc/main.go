package main

import (
	// "Algorithm_DataStructure/etc/algo"
	"Algorithm_DataStructure/etc/oop"
	"fmt"
)

func main() {
	// algo.Multiplication()

	person := oop.NewPerson(123, "hyuk")
	fmt.Println(person.GetName())
	person.SetName("hyuk2")
	fmt.Println(person.GetName())
	person.Check()

	man := oop.NewMan(345, "hyuk")
	fmt.Println(man.GetName())
	man.SetName("hyuk2")
	fmt.Println(man.GetName())
	man.Check()

	woman := oop.NewWoman("sun")

	oop.Speak(person)
	oop.Speak(man)
	oop.Speak(woman)

}
