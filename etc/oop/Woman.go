package oop

import "fmt"

type Woman struct {
	name string
}

func NewWoman(name string) *Woman {
	return &Woman{name: name}
}

func (woman Woman) Speak() {
	fmt.Printf("%s said that I am a woman\n", woman.name)
}
