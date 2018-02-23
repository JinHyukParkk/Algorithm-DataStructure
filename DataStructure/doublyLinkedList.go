package list

import (
	f "fmt"
)

type Node struct {
	next *Node
	prev *Node
	key  interface{}
}

type List struct {
	head *Node
	tail *Node
	len  int
}

func (l *List) Init() *List {
	l.head = nil
	l.tail = nil
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

func (l *List) Back() *Node {
	if l.len == 0 {
		return nil
	}
	return l.tail
}

func (l *List) Insert(key interface{}) {
	list := &Node{next: nil, prev: nil, key: key}
	if l.head == nil {
		l.head = list
		l.tail = list
	} else {
		L := l.head
		for L.next != nil {
			L = L.next
		}
		list.prev = L
		L.next = list
		l.tail = list
	}
}
func (l *List) InsertMiddle(idx int, key interface{}) {
	list := &Node{next: nil, prev: nil, key: key}
	L := l.head
	is := true
	if idx == 1 {
		L.prev = list
		list.next = L
		l.head = list
	} else if idx == l.len {
		l.tail.next = list
		list.prev = l.tail
		l.tail = list
	} else {
		for i := 0; i < idx-1; i++ {
			if L.next == nil {
				is = false
				break
			} else {
				L = L.next
			}
		}
		if is {
			L.prev.next = list
			list.prev = L.prev
			L.prev = list
			list.next = L
		} else {
			f.Println("idx don't exist")
		}
	}
}
func (l *List) Delete(key interface{}) {
	L := l.head
	is := true
	for L.key != key {
		if L.next == nil {
			is = false
			break
		}
		L = L.next
	}
	if is {
		L.prev.next = L.next
		L.next.prev = L.prev
		L.next = nil
		L.prev = nil
	} else {
		f.Println("key don't exist")
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
func (l *List) DisplayBack() {
	list := l.tail
	for list != nil {
		f.Printf("%+v -> ", list.key)
		list = list.prev
	}
	f.Print("Null")
	f.Println()
}
