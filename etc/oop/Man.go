package oop

import "fmt"

// Embed
type Man struct {
	*Person
}

func NewMan(name string) *Man {
	return &Man{Person: NewPerson(name)}
}

// Override
func (man Man) Check() {
	fmt.Printf("%s is a man\n", man.name)
}
