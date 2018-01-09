package list

import (
	f "fmt"
)

type Node struct {
	next *Node
	key  interface{}
}

type List struct {
	head *Node
	len  int
}

func (l *List) Init() *List {
	l.head = nil
	l.len = 0
	return l
}
func New() *List { return new(List).Init() }

func (l *List) Len() int { return l.len }

func (l *List) Front() *Node {
	if l.len == 0 {
		return nil
	}
	return l.head
}

func (l *List) Insert(key interface{}) {
	list := &Node{next: nil, key: key}
	if l.head == nil {
		l.head = list
	} else {
		L := l.head
		for L.next != nil {
			L = L.next
		}
		L.next = list
	}
	l.len++
}

//Garbage Collection 기능이 있기 때문에 C++과 다르게 메모리 해제를 안해도 된다.
func (l *List) Delete(key interface{}) {
	L := l.head
	if L.key == key {
		l.head = l.head.next
	}
	for L.next != nil {
		if L.next.key == key {
			L.next = L.next.next
			break
		}
		L = L.next
	}
}

func (l *List) Display() {
	list := l.head
	for list != nil {
		f.Printf("%+v -> ", list.key)
		list = list.next
	}
	f.Print("Null")
	f.Println()
}
