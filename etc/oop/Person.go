package oop

import "fmt"

type Person struct {
	security_number int
	name            string
}

// 생성자
func NewPerson(security_number int, name string) *Person {
	return &Person{security_number: security_number, name: name}
}

// 캡슐화
func (person Person) GetName() string {
	return person.name
}

// set의 경우 포인터 필요
func (person *Person) SetName(name string) {
	person.name = name
}

func (person Person) Check() {
	fmt.Printf("%s is a person\n", person.name)
}

func (person Person) Speak() {
	fmt.Printf("%s said that I am a person\n", person.name)
}
