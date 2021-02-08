package oop

type Person struct {
	name string
}

// 생성자 
func NewPerson(name string) *Person {
	return &Person{ name: name}
}

// 캡슐화
func (person Person) Getname() string {
	return person.name
}

// set의 경우 포인터 필요
func (person *Person) Setname(name string) {
	person.name = name
}
