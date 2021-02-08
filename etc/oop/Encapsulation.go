package oop

type Person struct {
	name string
}

// 생성자
func NewPerson(name string) *Person {
	return &Person{name: name}
}

// 캡슐화
func (person Person) GetName() string {
	return person.name
}

// set의 경우 포인터 필요
func (person *Person) SetName(name string) {
	person.name = name
}
